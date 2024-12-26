
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

  public static void main(String[] args) {

    String text ="";

    System.out.println(splitTextIntoWords(text));
  }


  public static String splitTextIntoWords(String text) {

    String regex = "[a-zA-z][’A-Za-z]{0,}";
    StringBuilder words = new StringBuilder();
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      words.append(text.substring(matcher.start(), matcher.end())).append("\n");
    }
    return words.toString().strip();
  }

}
