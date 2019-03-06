package Engine;

import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class Search {

    private String client;


    public Search() {
    }

    public void giveFeedback() {

        Read readCSV = new Read();
        List<String[]> strings = readCSV.readFileAndParse(Paths.get("findAnAnimal.csv"));

        for (String[] s : strings) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("What are you looking for?");
            String feedback = scanner.nextLine();

            if (feedback.equals("anyad")){
                System.out.println("type " + s[0]);
                System.out.println("noun " + s[1]);
                System.out.println("scientific noun " + s[2]);
            } else{
                throw new IndexOutOfBoundsException("wrong answer");
            }


        }
    }
}


