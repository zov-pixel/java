

public class CerealsAndLegumes {

    private final String name;

    private final TypeCerealsAndLegumes type;

    private final double weight;

    private final int shelfLife;

    public CerealsAndLegumes(String name, TypeCerealsAndLegumes type, double weight, int shelfLife) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.shelfLife = shelfLife;
    }

    public CerealsAndLegumes setName (String name) {
        return new CerealsAndLegumes(name, type, weight, shelfLife);
    }

    public CerealsAndLegumes setType (TypeCerealsAndLegumes type) {
        return new CerealsAndLegumes(name, type, weight, shelfLife);
    }

    public CerealsAndLegumes setWeight (double weight) {
        return new CerealsAndLegumes(name, type, weight, shelfLife);
    }

    public CerealsAndLegumes setShelfLife (int shelfLife) {
        return new CerealsAndLegumes(name, type, weight, shelfLife);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.name();
    }

    public double getWeight() {
        return weight;
    }

    public int getShelfLife() {
        return shelfLife;
    }
    public String toString() {
        return "Cereals and legumes: name: "+ getName() + ", type: " + getType() + ", weight: " + getWeight()+ ", shelf-life: " + getShelfLife();
    }

}
