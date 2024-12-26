
public class TotalEarningsCalculator {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    System.out.println(getTotalEarningsCalculator(text));

  }

  public static String getTotalEarningsCalculator(String text) {

    int end;
    Integer sum = 0;
    String text2 = "";

    for (int i = 0; i < text.length(); i++) {
      end = text.indexOf(" рубл", i);
      if (end > 0) {
        text2 = text.substring(0, end);
        i = text2.length();
        sum = sum + Integer.parseInt(text2.substring(text2.lastIndexOf(" "), text2.length()).trim());

      }
    } return sum +"";
  }
}
