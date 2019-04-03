package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
        System.out.println(getSeason(145));
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                return "зима";

            case 3:
            case 4:
            case 5:
                return "весна";

            case 6:
            case 7:
            case 8:
                return "лето";

            case 9:
            case 10:
            case 11:
                return "осень";

            default:
                throw new MyException(monthNumber);
        }
    }
}
