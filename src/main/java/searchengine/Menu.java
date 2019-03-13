package searchengine;

import animal.Animal;
import utilities.ListUtility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Menu {


    private AnimalParser getAnimals = new AnimalParser();

    /**
     * The menu of the game that reads user input
     * and gives appropriate queries according
     * to given information
     *
     * @return returns user input for the do while
     * in the main
     */


    public String getBackQuery() {


        System.out.println("[1] Query");
        System.out.println("[2] Past Queries");
        System.out.println("[3] Exit");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        switch (userInput) {

            case ("1"):

                System.out.println("[1] Query by name");
                System.out.println("[2] Advanced query");
                String querySearch = scanner.nextLine();

                switch (querySearch) {


                    case ("1") :

                        System.out.println("[1] By noun");
                        System.out.println("[2] By scientific noun");
                        String queryByName = scanner.nextLine().toUpperCase();


                        switch (queryByName) {

                            default:
                                System.out.println("No such options");
                                break;

                            case ("1") :

                                try {

                                    /*If user input equals to one of objects in animal list
                                      it's printed if not throws exception
                                      User can type either upper or lower caps as it will
                                      be converted to uppercase
                                    */

                                    System.out.println("Give the noun please");
                                    String searchByNoun = scanner.nextLine().toUpperCase();
                                    inputLogger("NOUN " + searchByNoun);
                                    boolean found = false;
                                    for (Animal s : getAnimals.parseAnimals()) {
                                        if (s.getNoun().equals(searchByNoun)) {
                                            System.out.println(s);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if(!found)
                                        throw new Exception();
                                    } catch(Exception e) {
                                        System.out.println("No such animal in list");
                                    }
                                break;

                            case ("2") :

                                try {

                                    System.out.println("Give scientific noun please");
                                    String searchByScientificNoun = scanner.nextLine().toUpperCase();
                                    inputLogger(searchByScientificNoun);
                                    boolean found = false;
                                    for (Animal s : getAnimals.parseAnimals()) {
                                        if (s.getScientificNoun().equals(searchByScientificNoun)) {
                                            System.out.println(s);
                                            found = true;
                                            break;
                                        }
                                    }
                                    if (!found)
                                        throw new Exception();
                                } catch (Exception e) {
                                    System.out.println("No such animals in list");
                                }
                                break;
                        }
                        break;

                    case ("2") :

                        /*Put every query in String[] with upper case
                          words. Put it into array list. And checking if
                          query is in animal list with the contains method
                         */

                        System.out.println("Give the query");
                        String query = scanner.nextLine().toUpperCase();
                        String[] complexQuery = query.split(",");
                        ArrayList<String> queryForSearch = new ArrayList<>(Arrays.asList(complexQuery));
                        System.out.println(Arrays.toString(complexQuery));
                        inputLogger(query);

                        for (Animal s: getAnimals.parseAnimals()) {
                            if (ListUtility.containsAll(s.getAsStringList(), queryForSearch)) {

                                System.out.println(s);

                            }
                        }
                        break;

                    default:
                        System.out.println("No such options, try it again");
                        break;
                }

                break;

            case ("2"):
                System.out.println("Give me the noun your searching the occurrence of");
                String occurrenceSearch = scanner.nextLine().toUpperCase();
                countOccurrence(occurrenceSearch);
                break;

            case ("3"):
                System.out.println("Program is Exiting");
                break;
            default:
                System.out.println("No such options, try it again");
                break;

        }
        return userInput;
    }

    /**
     * The logger of the user inputs. It records
     * user inputs and appending it to a text file if
     * exists. Otherwise creates a new one.
     *
     * @param appendingLine parameter for user input (scanner.nextLine() strings)
     */

    private static void inputLogger(String appendingLine) {

        appendingLine = appendingLine + '\n';

        try{
            Files.write(Paths.get("FindAnAnimalLog.txt"), appendingLine.getBytes(),
                    StandardOpenOption.APPEND,StandardOpenOption.CREATE);
        } catch(IOException e) {
            System.out.println("Problem with writing in Log file" + e.toString());
            System.exit(1);
        }
    }

    /**
     *The count occurrence function that gives back number
     * of occurrences of given nouns from the text file
     *
     *
     * @param searchedAnimal parameter for user input (searched noun)
     */

    private static void countOccurrence(String searchedAnimal) {
        int occurrence = 0;
        double all = 0;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("FindAnAnimalLog.txt")));
            while ((line = reader.readLine()) != null) {    //Reading through the text file if exists
                if (line.startsWith("NOUN ")) {             //and searching for Noun keyword.
                    all++;                                  //If there is, the overall counter increases.
                    if (line.contains(searchedAnimal)) {    //If that line contains the searched noun
                        occurrence++;                       //the occurrence number also increases
                    }

                }
            }
            //finally gives back the percentage by dividing occurrence with the overall counter.
            double finalOccurrence = (occurrence/all) * 100.0;

            System.out.println(String.format("The occurence of the noun is: %d." +
                            " The avarage of your searched noun: %.2f%%",
                    occurrence, finalOccurrence));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
