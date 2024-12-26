
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        try {
            while (true) {
                System.out.println("Введите номер, имя или команду");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if (input.equals("0")) {
                    break;
                } else {
                    if (input.strip().toLowerCase().substring(0, 4).equals("list")) {
                        System.out.println(phoneBook.getAllContacts());
                    } else if (input.strip().toLowerCase().substring(0, 3).equals("add")) {
                        String phone = input.strip().substring((input.length() - 12), (input.length()));
                        String name = input.strip().substring(4, (input.length() - 12));
                        phoneBook.addContact(phone, name);
                    } else {
                        phoneBook.check(input);

                    }
                }
            }
        } catch (StringIndexOutOfBoundsException s) {
            System.out.println("Введена неверная команда");
        }
    }
}
