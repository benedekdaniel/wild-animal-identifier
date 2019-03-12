package searchengine;

import animal.Animal;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AnimalParser {


    public List<Animal> parseAnimals() {
        BufferedReader reader = null;
        List<Animal> animals = new ArrayList<Animal>();

        try {
            String line = "";
            reader = new BufferedReader(new FileReader(new File("findAnAnimal.csv")));
            reader.readLine();

            while((line = reader.readLine()) != null) {
                line = line.toUpperCase();
                String[] fields = line.split(",");
                Animal animal;

                if(fields.length > 0) {


                    if (fields[0].equals("BIRD")) {
                        animal = new Bird();
                        // TODO: fill

                    } else if (fields[0].equals("REPTILE")) {
                        animal = new Reptile();
                        // TODO: fill
                    } else {
                        animal = new Mammal();
                    }
                }


            }

            return animals;

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return animals=null;


    }

}
