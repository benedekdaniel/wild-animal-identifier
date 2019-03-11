package animal;

public class Animal {

    private String type;
    private String noun;
    private String scientificNoun;

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

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", noun='" + noun + '\'' +
                ", scientificNoun='" + scientificNoun + '\'' +
                '}';
    }


}




