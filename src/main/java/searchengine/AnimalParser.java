package searchengine;

import animal.Animal;
import animal.Bird;
import animal.Mammal;
import animal.Reptile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalParser {

    /**
     *
     * Reading csv file and set animal
     * properties based on type
     *
     * @return returns animalList
     */


    public List<Animal> parseAnimals() {
        BufferedReader reader = null;
        List<Animal> animals = new ArrayList<Animal>();

        try {
            String line;
            reader = new BufferedReader(new FileReader(new File("findAnAnimal.csv")));
            reader.readLine();

            while((line = reader.readLine()) != null) {
                line = line.toUpperCase();
                String[] fields = line.split(",");
                Animal animal;

                if(fields.length > 0) {

                    //If type is BIRD,REPTILE,MAMMAL make appropriate instance

                    if (fields[0].equals("BIRD")) {
                        animal = new Bird();
                        newAnimal(fields, animal);
                        ((Bird) animal).setBeakShape(fields[11]);
                        ((Bird) animal).setColoursOfFeathers(fields[12]);
                        ((Bird) animal).setMinLengthOfWingspanCm(Double.parseDouble(fields[13]));
                        ((Bird) animal).setMaxLengthOfWingspanCm(Double.parseDouble(fields[14]));
                        animals.add(animal);


                    } else if (fields[0].equals("REPTILE")) {
                        animal = new Reptile();

                        newAnimal(fields, animal);
                        animals.add(animal);
                    } else {
                        animal = new Mammal();

                        newAnimal(fields, animal);
                        animals.add(animal);
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

    /**
     * Refactoring redundant data,
     * set properties once instead of
     * more times
     *
     * @param fields setting property by corresponding field
     * @param animal the animal which properties will be changed
     */

    private void newAnimal(String[] fields, Animal animal) {
        animal.setType(fields[0]);
        animal.setNoun(fields[1]);
        animal.setScientificNoun(fields[2]);
        animal.setMinSizeCm(Double.parseDouble(fields[3]));
        animal.setMaxSizeCm(Double.parseDouble(fields[4]));
        animal.setMinWeightGrams(Double.parseDouble(fields[5]));
        animal.setMaxWeightGrams(Double.parseDouble(fields[6]));
        animal.setColour(fields[7]);
        animal.setLocomotion(fields[8]);
        animal.setCountry(fields[9]);
        animal.setNaturalHabitats(fields[10]);
    }
}
