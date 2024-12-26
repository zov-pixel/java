
public class VegetablesAndFruits {
    private final String name;

    private final TypeVegetablesAndFruits type;

    private final double calorific;

    private final double weight;

    private final int shelfLife;



    public VegetablesAndFruits(String name, TypeVegetablesAndFruits type, double calorific, double weight, int shelfLife) {
        this.name = name;
        this.type = type;
        this.calorific = calorific;
        this.weight = weight;
        this.shelfLife = shelfLife;
    }

    public VegetablesAndFruits setName (String name) {
        return new VegetablesAndFruits(name, type, calorific, weight, shelfLife);
    }

    public VegetablesAndFruits setCaloric (double calorific) {
        return new VegetablesAndFruits(name, type, calorific, weight, shelfLife);
    }

    public VegetablesAndFruits setShelfLife (int shelfLife) {
        return new VegetablesAndFruits(name, type, calorific, weight, shelfLife);
    }

    public VegetablesAndFruits setWeight (double weight) {
        return new VegetablesAndFruits(name, type, calorific, weight, shelfLife);
    }

    public VegetablesAndFruits setType (TypeVegetablesAndFruits type) {
        return new VegetablesAndFruits(name, type, calorific, weight, shelfLife);
    }

    public String getName() {
        return name;
    }

    public double getCalorific() {
        return calorific;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type.name();
    }

    public String toString() {
        return "Vegetables and  fruits: name: "+ getName() + ", type: " + getType() + ", calorific: "  + getCalorific() + ", weight: " + getWeight()+ ", shelf-life: " + getShelfLife();
    }

}
