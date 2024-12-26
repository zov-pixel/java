
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodoList {

    public ArrayList<String> list = new ArrayList<>();

    String todo = "";

    public void input(String phrase) {
        String compared = phrase.replaceAll("\\s{2,}", " ");
        String[] words = compared.split(" ");
        String regex = "[0-9]{1,}";
        Pattern pattern = Pattern.compile(regex);
        if (words.length == 1 && words[0].toUpperCase().equals("LIST")) {
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + " - " + list.get(i));
                }
            } else {
                System.out.println("Список дел пуст");
            }

        } else if (words.length == 1) {
            System.out.println("Введена некорретная команда");

        } else {
            Matcher matcher = pattern.matcher(words[1]);

            if (words[0].toUpperCase().equals("ADD")) {

                if (matcher.find() == true) {
                    int index = Integer.parseInt(words[1].substring(matcher.start(), matcher.end()));
                    for (int i = 2; i < words.length; i++) {
                        todo = todo + " " + words[i];
                    }
                    add(index, todo.strip());
                    todo = "";

                } else {
                    for (int i = 1; i < words.length; i++) {
                        todo = todo + " " + words[i];
                    }
                    add(list.size(), todo.strip());
                    todo = "";
                }
            } else if (words[0].toUpperCase().equals("EDIT")) {
                if (matcher.find() == true) {
                    int index = Integer.parseInt(words[1].substring(matcher.start(), matcher.end()));
                    for (int i = 2; i < words.length; i++) {
                        todo = todo + " " + words[i];
                    }
                    edit(todo.strip(), index);
                    todo = "";

                } else {
                    System.out.println("Введена некорретная команда");
                }

            } else if (words[0].toUpperCase().equals("DELETE")) {
                if (matcher.find() == true) {
                    int index = Integer.parseInt(words[1].substring(matcher.start(), matcher.end()));
                    delete(index);
                } else {
                    System.out.println("Введена некорретная команда");
                }
            }
        }
    }
        public void add (String todo){
            list.add(list.size(), todo);
            System.out.println("Добавлено дело: " + todo);
        }

        public void add (int index, String todo){
            if (index >= list.size()) {
                list.add(todo);
                System.out.println("Добавлено дело: " + todo);
            } else {
                list.add(index, todo);
                System.out.println("Добавлено дело: " + todo);
            }
        }
        public void edit (String todo,int index){
            if (index >= list.size()) {
                System.out.println("Дело с таким номером не существует");
            } else {
                String status = list.get(index);
                list.remove(index);
                list.add(index, todo);
                System.out.println("Дело " + status + " заменено на " + todo);

            }
        }

        public void delete (int index){
            if (index >= list.size()) {
                System.out.println("Дело с таким номером не существует");
            } else {
                String status = list.get(index);
                list.remove(index);
                System.out.println("Дело " + status + " удалено");
            }
        }
    public ArrayList<String> getTodos() {
        return list;
    }

}
