
import net.sf.saxon.functions.ConstantFunction;

public class Main {
    public static void main(String[] args) {
     Dimensions dimensions = new Dimensions(1, 1, 1);
     Shipment shipment = new Shipment(dimensions.dimensionsNumber(), 5, "fbfbf", true, "102f", false);
        double checkOneNumb = shipment.getDimensions();
        dimensions = dimensions.setLength(8);
        double checkTwoNumb = shipment.getDimensions();
        System.out.print(checkOneNumb == checkTwoNumb ? "Копирование произошло" : "Копирование не произошло");
}}
