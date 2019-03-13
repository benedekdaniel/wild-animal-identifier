package animal;

import java.util.ArrayList;

public class Bird extends Animal {

    private String beakShape;
    private String coloursOfFeathers;
    private Double minLengthOfWingspanCm;
    private Double maxLengthOfWingspanCm;

    public Bird(){

    }

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

    @Override
    public ArrayList<String> getAsStringList() {
        ArrayList<String> asStringList = super.getAsStringList();
        asStringList.add(beakShape);
        asStringList.add(coloursOfFeathers);
        asStringList.add(maxLengthOfWingspanCm.toString());
        asStringList.add(minLengthOfWingspanCm.toString());

        return asStringList;
    }

    public void setMaxLengthOfWingspanCm(Double maxLengthOfWingspanCm) {
        this.maxLengthOfWingspanCm = maxLengthOfWingspanCm;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", \n beakShape = '" + beakShape + '\'' +
                ", \n coloursOfFeather = '" + coloursOfFeathers + '\'' +
                ", \n minLengthOfWingspanCm = '" + minLengthOfWingspanCm+ '\'' +
                ", \n maxLengthOfWingspanCm = '" + maxLengthOfWingspanCm+ '\'';
    }
}
