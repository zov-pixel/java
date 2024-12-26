
public class Shipment {
    private final double weight;
    private final String address;
    private final boolean turnOver;
    private final String regNumber;
    private final boolean fragile;
    private final double dimensions;

    public Shipment(double dimensions, double weight, String address, boolean turnOver, String regNumber, boolean fragile){
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.turnOver = turnOver;
        this.regNumber = regNumber;
        this.fragile = fragile;
}
    public Shipment setDimensions(double dimensions) { return new Shipment(dimensions, weight, address, turnOver, regNumber, fragile);}
    public Shipment setWeight(double weight) { return new Shipment(dimensions, weight, address, turnOver, regNumber, fragile);}
    public Shipment setRegNumber(String regNumber) { return new Shipment(dimensions, weight, address, turnOver, regNumber, fragile);}
    public Shipment setAddress(String address) { return new Shipment(dimensions, weight, address, turnOver, regNumber, fragile);}
    public Shipment setFragile(boolean fragile) { return new Shipment(dimensions, weight, address, turnOver, regNumber, fragile);}
    public Shipment setTurnOver(boolean turnOver) { return new Shipment(dimensions, weight, address, turnOver, regNumber, fragile);}

    public String getAddress() { return address;}
    public boolean isFragile () { return fragile;}
    public boolean isTurnOver () { return turnOver;}
    public String getRegNumber() { return regNumber;}
    public double getWeight() { return weight;}
    public double getDimensions() { return dimensions;}
}

