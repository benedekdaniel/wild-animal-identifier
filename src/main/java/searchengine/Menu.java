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


    public String getBackQuery() {


        System.out.println("[1] Query");
        System.out.println("[2] Past Queries");
        System.out.println("[3] Exit");

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();


        switch (x) {

            case ("1"):

                System.out.println("[1] Query by name");
                System.out.println("[2] Advanced query");
                String querySearch = scanner.nextLine();

                switch (querySearch) {


                    case ("1") :

                        System.out.println("[1] By noun");
                        System.out.println("[2] By scientificNoun");
                        String queryByName = scanner.nextLine().toUpperCase();


                        switch (queryByName) {

                            default:
                                System.out.println("No such options");
                                break;

                            case ("1") :

                                try {

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

                                System.out.println("Give scientific noun please");
                                String searchByScientificNoun = scanner.nextLine().toUpperCase();
                                inputLogger(searchByScientificNoun);

                                for (Animal s: getAnimals.parseAnimals()){
                                    if(s.getScientificNoun().equals(searchByScientificNoun)) {
                                        System.out.println(s);
                                        break;
                                    }
                                }
                                System.out.println("No such animal in list");
                                break;
                        }
                        break;

                    case ("2") :

                        System.out.println("Give me the query");
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
                System.out.println("Give me the noun your searching the occurance of");
                String occuranceSearch = scanner.nextLine().toUpperCase();
                countOccurence(occuranceSearch);
                break;

            case ("3"):
                System.out.println("Program is Exiting");
                break;
            default:
                System.out.println("No such options, try it again");
                break;

        }
        return x;
    }

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

    private static void countOccurence(String searchedAnimal) {
        int occurcance = 0;
        double all = 0;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("FindAnAnimalLog.txt")));
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("NOUN ")) {
                    all++;
                    if (line.contains(searchedAnimal)) {
                        occurcance++;
                    }

                    //TODO change name of value occurcance
                }
            }
            double finalOccurence = (occurcance/all) * 100.0;

            System.out.println(String.format("The occurence of the noun is: %d." +
                            " The avarage of your searched noun: %.2f%%",
                    occurcance, finalOccurence));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
