

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    public TreeSet<String> list = new TreeSet<>();

    String result ="";
    public void add(String email) {
        email = email.toLowerCase().replaceAll("\\s{2,}", " ");
        String regex = "[a-zA-Z0-9.-_%+]{1,}[@][a-zA-Z0-9.-]{1,}[.][ru|com]{1,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find() == true) {
            if (list.contains(email) == false) {
                list.add(email);
                System.out.println("В список добавлен: " + email);
            } else {
                System.out.println("В списке уже есть: " + email);
            }} else {
            System.out.println("Введен неверный формат данных");
        }
    }
    public void delete(String email) {
        if (list.contains(email) == true) {
        list.remove(email);
            System.out.println("Из списка удален: " +  email);
        }  else {
            System.out.println("В списке отсутствует: " +  email);
        }
    }
    public List<String> getSortedEmails() {

        return List.copyOf(list);
    }

}
