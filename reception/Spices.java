

public class Spices {
    private final String name;

    private final TypeSpices type;

    private final String intensityOfTheTaste;

    private final double weight;

    public Spices(String name, TypeSpices type, String intensityOfTheTaste, double weight) {
        this.name = name;
        this.type = type;
        this.intensityOfTheTaste = intensityOfTheTaste;
        this.weight = weight;
    }
    public Spices setName (String name) {
        return new Spices(name, type, intensityOfTheTaste, weight);
    }

    public Spices setWeight (double weight) {
        return new Spices(name, type, intensityOfTheTaste, weight);
    }

    public Spices setType (TypeSpices type) {
        return new Spices(name, type, intensityOfTheTaste, weight);
    }

    public Spices setIntensityOfTheTaste (String intensityOfTheTaste) {
        return new Spices(name, type, intensityOfTheTaste, weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type.name();
    }

    public String getIntensityOfTheTaste() {
        return intensityOfTheTaste;
    }

    public String toString() {
        return "Spices: name: "+ getName() + ", type: " + getType() + ", intensity of the taste: " + getIntensityOfTheTaste() + ", weight: " + getWeight();
    }


}
