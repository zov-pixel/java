

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameFormatterRegExp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      } else {

        String regex = "([-А-я]{1,}+[ ]{1,}+[-А-я]{1,}+[ ]{1,}+[-А-я]{1,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String text="";
        String name ="";

        if (matcher.find() == true) {

          String regexWords = "[-А-я]{1,}";
          Pattern patternWords = Pattern.compile(regexWords);
          Matcher matcherWords = patternWords.matcher(input);
          int numb = 0;
          String[] list = new String[3];

          while (matcherWords.find()) {
            name = input.substring(matcherWords.start(), matcherWords.end());
            list[numb] = name;
            numb += 1;
          }
          System.out.println("Фамилия: "+ list[0] + "\n" + "Имя: " + list[1] + "\n" + "Отчество: " + list[2]);
        } else {
          System.out.println("Введенная строка не является ФИО");
        }
      }
    }
  }
}
