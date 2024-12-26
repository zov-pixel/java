
public class MeatAndFish {

    private final NameMeatAndFish name;

    private final String partOfTheCarcass;

    private final double weight;

    private final int shelfLife;

    public MeatAndFish(NameMeatAndFish name, String partOfTheCarcass , double weight, int shelfLife) {
        this.name = name;
        this.partOfTheCarcass = partOfTheCarcass;
        this.weight = weight;
        this.shelfLife = shelfLife;
    }

    public MeatAndFish setName (NameMeatAndFish name) {
        return new MeatAndFish(name, partOfTheCarcass, weight, shelfLife);
    }

    public MeatAndFish setPartOfTheCarcass (String partOfTheCarcass) {
        return new MeatAndFish(name, partOfTheCarcass, weight, shelfLife);
    }

    public MeatAndFish setShelfLife (int shelfLife) {
        return new MeatAndFish(name, partOfTheCarcass, weight, shelfLife);
    }

    public MeatAndFish setWeight (double weight) {
        return new MeatAndFish(name, partOfTheCarcass, weight, shelfLife);
    }

    public String getName() {
        return name.name();
    }

    public String getPartOfTheCarcass() {
        return partOfTheCarcass;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public double getWeight() {
        return weight;
    }


    public String toString() {
        return "Meat and fish: name: "+ getName() + ", part of the carcass: " + getPartOfTheCarcass() + ", weight: " + getWeight()+ ", shelf-life: " + getShelfLife();
    }

}
