package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {

        String str = "monthNumber %d is invalid, month number should be between 1..12";

        if (monthNumber <= 0 || monthNumber > 12){
            throw new MyException(String.format(str, monthNumber));
        }

        if (monthNumber > 2 && monthNumber < 6) {
            return "весна";
        }
        if (monthNumber > 5 && monthNumber < 9) {
            return "лето";
        }
        if (monthNumber > 8 && monthNumber < 12) {
            return "осень";
        }

        return "зима";
    }

}