package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //System.out.println("Корректный ввод");
        //System.out.println(getSeason(10));
        System.out.println("Некорректный ввод");
        System.out.println(getSeason(-10));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }

        if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "осень";
        } else {
            return "зима";
        }
    }

}