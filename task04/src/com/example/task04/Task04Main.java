package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    public static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber >= 1 && monthNumber <= 2) {
            return "Зима";
        }

        if (monthNumber >= 3 && monthNumber <= 5) {
            return "Весна";
        }

        if (monthNumber >= 6 && monthNumber <= 8) {
            return "Лето";
        }

        if (monthNumber >= 9 && monthNumber <= 11) {
            return "Осень";
        }

        throw new MyException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
    }

}