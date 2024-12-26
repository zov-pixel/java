

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        try {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("0")) {
                    break;
                } else {
                input = input.strip().replaceAll("\\s{2,}", " ");
                if (input.substring(0, 3).toLowerCase().equals("add")) {
                       emailList.add(input.substring(4, (input.length())));
                } else if (input.substring(0, 4).toLowerCase().equals("list")) {
                    for (String i: emailList.getSortedEmails())
                    System.out.println(i);
            } else if (input.substring(0, 6).toLowerCase().equals("delete")) {
                    emailList.delete(input.substring(7, (input.length())));
            } else {
                    System.out.println("Введена неверная команда");
                    }
                }

                }

        } catch (StringIndexOutOfBoundsException s) {
            System.out.println("Введена неверная команда");
        }
    }
    }

