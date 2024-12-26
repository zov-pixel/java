

import java.util.Scanner;

public class NameFormatter {

  public static void main(String[] args) {

    String text = "";
    String result = "";
    String checking;

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      } else {
        try {
          String lastname = input.substring(0, input.indexOf(" ")).trim();
          String name = input.substring(lastname.length(), input.lastIndexOf(" ")).trim();
          String middleName = input.substring(input.lastIndexOf(" ", input.length())).trim();
          checking = lastname + name + middleName;
          result = "";
          for (char c : input.toLowerCase().toCharArray()) {
            if ((int) c == 45 | (int) c > 1071 && (int) c < 1104) {
              result = result + c;
              text = result;
              if (text.length() == checking.length()) {
                text = "Фамилия: " + lastname + "\n" + "Имя: " + name + "\n" + "Отчество: " + middleName;
              } else {
                text = "Введенная строка не является ФИО";
              }
            } else {
              text = "Введенная строка не является ФИО";
            }
          }
        } catch (StringIndexOutOfBoundsException s) {
          text = "Введенная строка не является ФИО";
        }
        System.out.println(text);
      }
    }
  }
}

