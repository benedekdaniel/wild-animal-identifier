package animal;

public class Animal {

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


//    public Animal(final String aType, final String aNoun, final String aScientificNoun, final int aMinSizeCm,
//                  final int aMaxSizeCm, final int aMinWeightGrams, final int aMaxWeightGrams, final String aColour,
//                  final String aLocomotion, final String aCountry, final String aNaturalHabitats) {
//
//
//        this.type = aType;
//        this.noun = aNoun;
//        this.scientificNoun  = aScientificNoun;
//        this. minSizeCm = aMinSizeCm;
//        this. maxSizeCm = aMaxSizeCm;
//        this.minWeightGrams = aMinWeightGrams;
//        this.maxWeightGrams = aMaxWeightGrams;
//        this.colour = aColour;
//        this.locomotion = aLocomotion;
//        this.country = aCountry;
//        this.naturalHabitats = aNaturalHabitats;
//    }


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

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", noun='" + noun + '\'' +
                ", scientificNoun='" + scientificNoun + '\'' +
                ", minSizeCm=" + minSizeCm +
                ", maxSizeCm=" + maxSizeCm +
                ", minWeightGrams=" + minWeightGrams +
                ", maxWeightGrams=" + maxWeightGrams +
                ", colour='" + colour + '\'' +
                ", locomotion='" + locomotion + '\'' +
                ", country='" + country + '\'' +
                ", naturalHabitats='" + naturalHabitats + '\'' +
                '}';
    }
}




