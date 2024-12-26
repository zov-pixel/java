

import java.util.*;

import static java.lang.System.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите номер, имя или команду");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            if (number.equals("0")) {
                break;
            } else {
                CoolNumbers coolNumbers = new CoolNumbers();
                coolNumbers.bruteForceSearchInList(coolNumbers.generateCoolNumbers(), number);
                coolNumbers.binarySearchInList(coolNumbers.generateCoolNumbers(), number);
                HashSet<String> hashSet = new HashSet<>(coolNumbers.generateCoolNumbers());
                coolNumbers.searchInHashSet(hashSet, number);
                TreeSet<String> treeSet = new TreeSet<>(coolNumbers.generateCoolNumbers());
                coolNumbers.searchInTreeSet(treeSet, number);

            }
        }
    }
}



