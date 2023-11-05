package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(0));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
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