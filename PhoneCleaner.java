

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCleaner {

  public static void main(String[] args) {
    String result = "";
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      } else {
        String phoneNumber = "";
        String regex = "[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
          phoneNumber = phoneNumber + input.substring(matcher.start(), matcher.end());
        }

        if (phoneNumber.length() == 11 | phoneNumber.length() == 10) {
          if (phoneNumber.length() == 11) {
            if (phoneNumber.substring(0, 1).equals("7")) {
              result = phoneNumber;
            } else if (phoneNumber.substring(0, 1).equals("8")) {
              result = "7" + phoneNumber.substring(1, phoneNumber.length());
            } else {
              result = "Неверный формат номера";
            }
          } else {
            result = "7" + phoneNumber;
          }
        } else {
          result = "Неверный формат номера";
        }
      } System.out.println(result);
    }
  }
}
