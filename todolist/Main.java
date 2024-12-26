
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                todoList.input(input);

            }

        }
    }
}
