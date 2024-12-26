

public class ReverseArray {
    public static String[] reverse(String[] strings) {
        String variable;
        int count = 1;

        while (count < strings.length) {
            for (int i = 0; i < strings.length - count; i++) {
                variable = strings[i + 1];
                strings[i + 1] = strings[i];
                strings[i] = variable;
            }
            count = count + 1;

        }
        return strings;
    }
}

