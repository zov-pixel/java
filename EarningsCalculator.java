

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EarningsCalculator {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    System.out.println(calculateSalarySum(text));
  }


  public static int calculateSalarySum(String text){

    int sum = 0;

    String regex = "[0-9]{1,}";

    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {

      sum = sum + Integer.parseInt(text.substring(matcher.start(), matcher.end()));
    }
    return sum;
  }
}
