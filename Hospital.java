

import java.text.DecimalFormat;
import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
    float[] temperatureData = new float[patientsCount];
    float randomTemperature;
    float lastPartRandomTemperature;
        Random random = new Random();

        for(int i =0; i < temperatureData.length; i++) {
            randomTemperature = random.nextInt(39-32) + 32;
            lastPartRandomTemperature =Math.round(random.nextFloat()*10);
            temperatureData[i] = randomTemperature + (lastPartRandomTemperature / 10);
    }
        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {

        StringBuilder temperatures = new StringBuilder();
        temperatures.append("Температуры пациентов:");
        float average;
        float sum = 0;
        int count = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            temperatures.append(" ").append(temperatureData[i]);
            sum = sum + temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] < 37) {
                count += 1;
            }
        }
        average = Math.round(sum/temperatureData.length*100);
        average = average/ 100;
        return temperatures.toString() + "\n" + "Средняя температура: " +  average + "\n" + "Количество здоровых: " + count;
    }

    public static void main(String[] args) {

        float[] temperatureData = Hospital.generatePatientsTemperatures(100);
        System.out.println(Hospital.getReport(temperatureData));

    }
}
