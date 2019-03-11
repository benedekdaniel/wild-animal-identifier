package searchengine;

import animal.Animal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {


    private AnimalParser getAnimals = new AnimalParser();

    public void getBackQuery() throws IOException {

        System.out.println("What you searching by?");
        System.out.println("[1] Query");
        System.out.println("[2] Past Queries");
        System.out.println("[3] Exit");

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();


        switch (x) {

            case ("1"):

                System.out.println("Give the type: ");
                String typeSearch = scanner.nextLine();
                System.out.println("Give me the noun");
                String nounSearch = scanner.nextLine();
                System.out.println("Give me the scientificNoun");
                String scientificNounSearch = scanner.nextLine();


                for (Animal s : getAnimals.getBackAnimals()) {
                    if (s.getType().equals(typeSearch) && s.getNoun().equals(nounSearch)
                            && s.getScientificNoun().equals(scientificNounSearch)) {
                        System.out.println(s);
                    }
                }
                break;

            case ("2"):
                System.out.println("Past Queries");
                break;

            case ("3"):
                System.out.println("Program is Exiting");
                break;

            default:
                System.out.println("No such options");
                break;
        }

    }
}

