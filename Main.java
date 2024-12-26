package ru.lessons.lesson2.task1;

public class Main {



    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        System.out.println(dinnerMenu.canMake(1000, 400, 5,
            10, 30, 8));
    }

}
