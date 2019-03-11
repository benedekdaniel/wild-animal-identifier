package animal;

import java.util.Map;

public class Animal {

    private String type;
    private String noun;
    private String scientificNoun;
    private int minSize;
    private int maxSize;
    private int minWeight;
    private int maxWeight;
    private String countries;
    private String habitats;


    public Animal(Map<String , String> row) {
        this.type = row.get("type");
        this.noun = row.get("noun");
        this.scientificNoun = row.get("scientificnoun");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getScientificNoun() {
        return scientificNoun;
    }

    public void setScientificNoun(String scientificNoun) {
        this.scientificNoun = scientificNoun;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", noun='" + noun + '\'' +
                ", scientificNoun='" + scientificNoun + '\'' +
                '}';
    }
}




