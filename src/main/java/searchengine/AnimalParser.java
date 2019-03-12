package searchengine;

import animal.Animal;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AnimalParser {


    public List<Animal> parseAnimals(Path filePath) {
        BufferedReader reader = null;
        List<Animal> animals = new ArrayList<Animal>();
        Read y = new Read();

        try {
            String line = "";
            reader = new BufferedReader(new FileReader(String.valueOf(y.gettingFilePath())));
            reader.readLine();

            while((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                if(fields.length > 0) {
                    Animal animal = new Animal();
                    animal.setType(fields[0]);
                    animal.setNoun(fields[1]);
                    animal.setScientificNoun(fields[2]);
                    animals.add(animal);
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