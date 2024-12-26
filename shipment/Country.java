import Shipment;

public class Country {
    private String nameOfCountry;
    private double population;
    private double square;
    private String nameOfCapital;
    private boolean accessToTheSea;


    public Country(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) { this.nameOfCountry = nameOfCountry;}
    public void setPopulation(double population) {this.population = population;}
    public void setSquare(double square) {this.square = square;}
    public void setNameOfCapital(String nameOfCapital) {this.nameOfCapital = nameOfCapital;}
    public void setAccessToTheSea(boolean accessToTheSea) {this.accessToTheSea = accessToTheSea;}
    public String getNameOfCountry() { return nameOfCountry; }
    public double getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getNameOfCapital() {
        return nameOfCapital;
    }

    public boolean isAccessToTheSea() {
        return accessToTheSea;
    }
}
