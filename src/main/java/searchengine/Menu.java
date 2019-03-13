package searchengine;

import animal.Animal;

import java.io.IOException;
import java.util.Scanner;


public class Menu {


    private AnimalParser getAnimals = new AnimalParser();


    public void getBackQuery() throws IOException {


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

                                System.out.println("Give the noun please");
                                String searchByNoun = scanner.nextLine().toUpperCase();

                                for (Animal s: getAnimals.parseAnimals()){
                                    if(s.getNoun().equals(searchByNoun)){
                                        System.out.println(s);
                                        break;
                                    }
                                }
                                break;

                            case ("2") :
                                System.out.println("Give scientific noun please");
                                String searchByScientificNoun = scanner.nextLine().toUpperCase();

                                for (Animal s: getAnimals.parseAnimals()){
                                    if(s.getScientificNoun().equals(searchByScientificNoun)) {
                                        System.out.println(s);
                                        break;
                                    }
                                }
                                break;
                        }
                        break;

                    case ("2") :

                        System.out.println("Choose from options");
                        break;

                    default:
                        System.out.println("No such options, try it again");
                        break;
                }

                break;

            case ("2"):
                System.out.println("Past Queries");
                break;

            case ("3"):
                System.out.println("Program is Exiting");
                break;

            default:
                System.out.println("No such options, try it again");
                break;

        }

    }
}

