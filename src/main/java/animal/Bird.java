package animal;

public class Bird extends Animal {

    private String beakShape;
    private String coloursOfFeathers;
    private Double minLengthOfWingspanCm;
    private Double maxLengthOfWingspanCm;

    public Bird(){

    }

//    public Bird(final String aType, final String aNoun, final String aScientificNoun,
//                final int aMinSizeCm, final int aMaxSizeCm, final int aMinWeightGrams,
//                final int aMaxWeightGrams, final String aColour, final String aLocomotion,
//                final String aCountry, final String aNaturalHabitats, final String aBeakShape,
//                final String aColoursOfFeathers, final int aMinLengthOfWingspanCm,
//                final int aMaxLengthOfWingspanCm){
//
//
//        super(aType,aNoun, aScientificNoun, aMinSizeCm, aMaxSizeCm, aMinWeightGrams, aMaxWeightGrams,
//                aColour, aLocomotion, aCountry, aNaturalHabitats);
//
//        this.beakShape = aBeakShape;
//        this.coloursOfFeathers = aColoursOfFeathers;
//        this.minLengthOfWingspanCm = aMinLengthOfWingspanCm;
//        this.maxLengthOfWingspanCm = aMaxLengthOfWingspanCm;
//
//
//    }

    public String getBeakShape() {
        return beakShape;
    }

    public void setBeakShape(String beakShape) {
        this.beakShape = beakShape;
    }

    public String getColoursOfFeathers() {
        return coloursOfFeathers;
    }

    public void setColoursOfFeathers(String coloursOfFeathers) {
        this.coloursOfFeathers = coloursOfFeathers;
    }

    public Double getMinLengthOfWingspanCm() {
        return minLengthOfWingspanCm;
    }

    public void setMinLengthOfWingspanCm(Double minLengthOfWingspanCm) {
        this.minLengthOfWingspanCm = minLengthOfWingspanCm;
    }

    public Double getMaxLengthOfWingspanCm() {
        return maxLengthOfWingspanCm;
    }

    public void setMaxLengthOfWingspanCm(Double maxLengthOfWingspanCm) {
        this.maxLengthOfWingspanCm = maxLengthOfWingspanCm;
    }


}
