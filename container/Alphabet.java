
public class Alphabet {
static String middleResult;
static String finalResult = "";
    public static String getCodeAlphabet() {
        String stringOfAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" + "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".toLowerCase();
        for(char alphabet: stringOfAlphabet.toCharArray()){
            middleResult = String.valueOf(alphabet);
            middleResult = ""+ (int) alphabet + " - " + middleResult;
            finalResult = finalResult + middleResult + "\n";
        }
            return finalResult;
    }

    public static void main() {
        System.out.println(getCodeAlphabet());
    }
}
