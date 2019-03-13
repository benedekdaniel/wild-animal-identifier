package animal;

import java.util.ArrayList;

public abstract class Animal {

    /**
     * Animal class
     *
     * Superclass of all animals
     * Shares base properties
     *
     */

    private String type;
    private String noun;
    private String scientificNoun;
    private Double minSizeCm;
    private Double maxSizeCm;
    private Double minWeightGrams;
    private Double maxWeightGrams;
    private String colour;
    private String locomotion;
    private String country;
    private String naturalHabitats;


    public Animal() {

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

    public Double getMinSizeCm() {
        return minSizeCm;
    }

    public void setMinSizeCm(Double minSizeCm) {
        this.minSizeCm = minSizeCm;
    }

    public Double getMaxSizeCm() {
        return maxSizeCm;
    }

    public void setMaxSizeCm(Double maxSizeCm) {
        this.maxSizeCm = maxSizeCm;
    }

    public Double getMinWeightGrams() {
        return minWeightGrams;
    }

    public void setMinWeightGrams(Double minWeightGrams) {
        this.minWeightGrams = minWeightGrams;
    }

    public Double getMaxWeightGrams() {
        return maxWeightGrams;
    }

    public void setMaxWeightGrams(Double maxWeightGrams) {
        this.maxWeightGrams = maxWeightGrams;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLocomotion() {
        return locomotion;
    }

    public void setLocomotion(String locomotion) {
        this.locomotion = locomotion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNaturalHabitats() {
        return naturalHabitats;
    }

    public void setNaturalHabitats(String naturalHabitats) {
        this.naturalHabitats = naturalHabitats;
    }

    /**
     * The getAsStringList function
     * Returns a string list with the same attributes as the
     * animal list ones
     *
     * @return asStringList
     */


    public ArrayList<String> getAsStringList() {
        ArrayList<String> asStringList = new ArrayList<>();

        asStringList.add(type);
        asStringList.add(noun);
        asStringList.add(scientificNoun);
        asStringList.add(minSizeCm.toString());
        asStringList.add(maxSizeCm.toString());
        asStringList.add(minWeightGrams.toString());
        asStringList.add(maxWeightGrams.toString());
        asStringList.add(colour);
        asStringList.add(locomotion);
        asStringList.add(country);
        asStringList.add(naturalHabitats);

        return asStringList;
    }

    @Override
    public String toString() {
        return "Animal{" +
                " \n type = '" + type + '\'' +
                ", \n noun = '" + noun + '\'' +
                ", \n scientificNoun = '" + scientificNoun + '\'' +
                ", \n minSizeCm = " + minSizeCm +
                ", \n maxSizeCm = " + maxSizeCm +
                ", \n minWeightGrams = " + minWeightGrams +
                ", \n maxWeightGrams = " + maxWeightGrams +
                ", \n colour = '" + colour + '\'' +
                ", \n locomotion = '" + locomotion + '\'' +
                ", \n country = '" + country + '\'' +
                ", \n naturalHabitats = '" + naturalHabitats + '\'' +
                '}';
    }
}




