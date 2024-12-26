package ru.lessons.lesson2.task2;

public class AgeComparator {

    public static String getComparator(int vasyaAge, int katyaAge, int mishaAge) {
        //TODO: Тут реализуйте код по заданию
        int min = -1;
        int middle = -1;
        int max = -1;
        if (vasyaAge >=katyaAge) {
            if (katyaAge >= mishaAge) {
                max = vasyaAge;
                middle = katyaAge;
                min = mishaAge;
            } else {
                max = vasyaAge;
                middle = mishaAge;
                min = katyaAge;}
        } else {
            if (vasyaAge >=mishaAge && katyaAge >= mishaAge) {
            max = katyaAge;
            middle = vasyaAge;
            min = mishaAge;
             } else {
                if (vasyaAge <= katyaAge) {
                max = katyaAge;
                middle = mishaAge;
                min = vasyaAge;
                }  else {
                max = mishaAge;
                middle = katyaAge;
                min = vasyaAge;}}}
        return "Minimal age: "  + min + "\n" + "Middle age: " + middle + "\n" + "Maximal age: " + max; }
    }


