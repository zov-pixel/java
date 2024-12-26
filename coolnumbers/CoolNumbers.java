
import java.util.*;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        String[] firstLetter = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] secondLetter = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] thirdLetter = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] listNumbers = new String[]{"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};
        String[] region = new String[199];
        ArrayList<String> listCoolNumbers = new ArrayList<>();

        for (int r = 0; r < region.length; r++) {
            String number = Integer.toString(r + 1);
            if (number.length() == 1) {
                region[r] = 0 + number;
            } else {
                region[r] = number;
            }
        }

        for (int f = 0; f < firstLetter.length; f++) {
            for (int l = 0; l < listNumbers.length; l++) {
                for (int s = 0; s < secondLetter.length; s++) {
                    for (int t = 0; t < thirdLetter.length; t++) {
                        for (int r = 0; r < region.length; r++)
                            listCoolNumbers.add(firstLetter[f] + listNumbers[l] + secondLetter[s] + thirdLetter[t] + region[r]);
                    }
                }
            }
        }
        Collections.sort(listCoolNumbers);
        List<String> finalCoolNumbers = Collections.unmodifiableList(listCoolNumbers);
        return finalCoolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        String timeSearch = String.valueOf(System.nanoTime());
        String result = "a. Поиск перебором: номер не найден, поиск занял " + timeSearch + "нс";
        boolean returnStatement = false;
        for (String j : list) {
            if (j.equals(number) == true) {
                returnStatement = true;
            result = "a. Поиск перебором: номер найден, поиск занял " + timeSearch + "нс";
            break;}
        }
        System.out.println(result);
        return returnStatement;

    }
    public static boolean binarySearchInList(List<String> sortedList, String number) {
        String timeSearch = String.valueOf(System.nanoTime());
        String result = "b. Бинарный поиск: номер не найден, поиск занял " + timeSearch + "нс";
        boolean returnStatement = false;
        int low = 0;
        int high = sortedList.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = number.compareTo(sortedList.get(mid));
            if (res == 0)
            {
                result = "b. Бинарный поиск: номер найден, поиск занял " + timeSearch + "нс";
                returnStatement = true;
            }
            if (res > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result);
        return returnStatement;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        String timeSearch = String.valueOf(System.nanoTime());
        if (hashSet.contains(number) == true) {
            System.out.println("c. Поиск в HashSet: номер найден, поиск занял " + timeSearch + "нс");
            return true;
        } else {
            System.out.println("c. Поиск в HashSet: номер не найден, поиск занял " + timeSearch + "нс");
            return false;
        }
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        String timeSearch = String.valueOf(System.nanoTime());
        if (treeSet.contains(number) == true) {
            System.out.println("d. Поиск в TreeSet: номер найден, поиск занял " + timeSearch + "нс");
            return true;
        } else {
            System.out.println("d. Поиск в TreeSet: номер не найден, поиск занял " + timeSearch + "нс");
            return false;
        }
    }

}