

public class MilkProducts {

    private final String name;

    private final double fat;

    private final int volume;

    private final int shelfLife;

    public MilkProducts(String name, double fat,  int volume, int shelfLife) {
        this.name = name;
        this.fat = fat;
        this.volume = volume;
        this.shelfLife = shelfLife;
    }

    public MilkProducts setName (String name) {
        return new MilkProducts(name, fat, volume, shelfLife);
    }

    public MilkProducts setFat (double fat) {
        return new MilkProducts(name, fat, volume, shelfLife);
    }

    public MilkProducts setShelfLife (int shelfLife) {
        return new MilkProducts(name, fat, volume, shelfLife);
    }

    public MilkProducts setVolume (int volume) {
        return new MilkProducts(name, fat, volume, shelfLife);
    }

    public String getName() {
        return name;
    }

    public double getFat() {
        return fat;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return "Milk products: name: "+ getName() + ", fat: " + getFat() + ", volume: " + getVolume()+ ", shelf-life: " + getShelfLife();
    }
}
