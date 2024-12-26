import java.math.BigDecimal;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int count = 6;

        float[] temperatureData = new float[count];
        float n = 0.1F;

        Random rn = new Random();
        for(int i =0; i < temperatureData.length; i++) {
            float rn2 = rn.nextFloat(32, 39);
            temperatureData[i] = Math.round(rn2)+(i+1)/5.0F;
            System.out.println(temperatureData[i]);
        }
    }
}
