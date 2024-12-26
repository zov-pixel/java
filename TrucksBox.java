

import java.util.Scanner;

public class TrucksBox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int boxesInt = Integer.parseInt(boxes);
        int countBoxes = 0;
        int countContains = 0;
        int countAuto = 0;
        int countCircle = 1;
        int countCircleOfContains = 1;
        int countContainsFinal;

        countBoxes = boxesInt;


        while (countBoxes  > 0) {
            countBoxes = countBoxes - 27;
            countContains += 1;
        }

    countContainsFinal = countContains;


        while (countContainsFinal  > 0) {
            countContainsFinal= countContainsFinal - 12;
            countAuto += 1;
        }
        countContainsFinal = countContains;

    for (int i = 1; i <= countAuto; i++) {
        System.out.println("Грузовик: " + i);

        for (int j = 1; j <= countContains; ++j) {
            if (j % 13 == 0) {
                break;
            }
        System.out.println("\tКонтейнер: " + countCircleOfContains);
            countCircleOfContains += 1;

        for (int c = 1; c <= boxesInt; ++c) {
            if (c % 28 == 0) {
                break;
            }
            System.out.println("\t\tЯщик: " + countCircle);
            countCircle += 1;
        } boxesInt = boxesInt - 27;
        } countContains = countContains - 12;

    }
    System.out.println("Необходимо:\nгрузовиков - " + countAuto + " шт." + "\nконтейнеров - "+ countContainsFinal  + " шт.");
    }

}
