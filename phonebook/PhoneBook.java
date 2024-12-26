

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    public TreeMap<String, String> phoneBook = new TreeMap<>();
    public TreeMap<String, String> phoneBookGetList = new TreeMap<>();
    public TreeMap<String, String> phoneBookGetName = new TreeMap<>();
    public TreeSet<String> listGetList = new TreeSet<>();
    public TreeSet<String> listGetName = new TreeSet<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        String nameRegex = "[А-Яа-я]{1,}";
        Pattern patternName = Pattern.compile(nameRegex);
        Matcher matcherName = patternName.matcher(name);
        String phoneRegex = "[7]+[0-9]{10}\\b";
        Pattern patternPhone = Pattern.compile(phoneRegex);
        Matcher matcherPhone = patternPhone.matcher(phone);
        if (matcherPhone.find() == true && matcherName.find() == true) {
            phoneBook.put(phone, name);
            System.out.println("Контакт " + name + " " + phone + " добавлен");
        } else {
            System.out.println("Введены некорректные данные");
        }
    }

    public void check(String input) {
        String nameRegex = "[А-Яа-я]{1,}";
        Pattern patternName = Pattern.compile(nameRegex);
        Matcher matcherName = patternName.matcher(input);
        String phoneRegex = "[7]+[0-9]{10}\\b";
        Pattern patternPhone = Pattern.compile(phoneRegex);
        Matcher matcherPhone = patternPhone.matcher(input);
        if (matcherPhone.find() == true) {
            getNameByPhone(input);
        } else if (matcherName.find() == true) {
            getPhonesByName(input);
        } else
            System.out.println("Введены некорректные данные");
    }

    public String getNameByPhone(String phone) {
        if (phoneBook.containsKey(phone) == false) {
            System.out.println("Такого номера в телефонной книге нет.\nВведите имя для номера " + phone);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String nameRegex = "[А-Яа-я]{1,}";
            Pattern patternName = Pattern.compile(nameRegex);
            Matcher matcherName = patternName.matcher(input);
            if (matcherName.find() == true) {
                phoneBook.put(phone, input);
                System.out.println("Контакт сохранен!");}
            else {
                System.out.println("Введен некорректный формат");
            }
        } else {
            System.out.println("Данный номер уже закреплен за " + phoneBook.get(phone));
        }
        return phoneBook.get(phone) + " - " + phone;
    }

    public Set<String> getPhonesByName(String name) {
        String key = " ";
        String value = " ";
        String finalResult;
        phoneBookGetName.put(value, key);
        if (phoneBook.containsValue(name) == false) {
            System.out.println("Такого имени в телефонной книге нет.\nВведите номер для абонента " + name);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String phoneRegex = "[7]+[0-9]{10}\\b";
            Pattern patternPhone = Pattern.compile(phoneRegex);
            Matcher matcherPhone = patternPhone.matcher(input);
            if (matcherPhone.find() == true) {
                phoneBook.put(input, name);
                System.out.println("Контакт сохранен!");}
            else {
                System.out.println("Введен некорректный формат");
            }
        } else {
            for (var pair : phoneBook.entrySet()) {
                value = pair.getValue();
                if (value.equals(name)) {
                    key = pair.getKey();
                    finalResult = value + " - " + key;
                    if(phoneBookGetName.containsKey(value) == true) {
                        String result = value + " - " + phoneBookGetName.get(value);
                        key = phoneBookGetName.get(value) +", " + key;
                        phoneBookGetName.replace(value, key);
                        listGetName.remove(result);
                        listGetName.add(value + " - " + key);
                    } else {
                    listGetName.add(finalResult);
                    phoneBookGetName.put(value, key);

                }
                } else {
                    break;
                }
            }
            System.out.println(listGetName);
        }
        return listGetName;
    }

    public Set<String> getAllContacts() {
        String finalResult;
        String value = " ";
        String key = " ";
        phoneBookGetList.put(value, key);
        for (var pair : phoneBook.entrySet()) {
            value = pair.getValue();
            key = pair.getKey();
            finalResult = value + " - " + key;
            if(phoneBookGetList.containsKey(value) == true) {
                String result = value + " - " + phoneBookGetList.get(value);
                key = phoneBookGetList.get(value) +", " + key;
                phoneBookGetList.replace(value, key);
                listGetList.remove(result);
                listGetList.add(value + " - " + key);
            } else {
            listGetList.add(finalResult);
            phoneBookGetList.put(value, key);

        }
        }
        return listGetList;
    }
}
