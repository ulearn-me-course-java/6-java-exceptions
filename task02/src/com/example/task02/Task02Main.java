package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1) {
            throw new IllegalArgumentException(String.format(
                            "invalid monthNumber value, month number should be between 1-12, but %d", monthNumber));
        }

        if (monthNumber < 3 || monthNumber == 12) {
            return "зима";
        } else if (monthNumber < 6) {
            return "весна";
        } else if (monthNumber < 9) {
            return "лето";
        } else {
            return "осень";
        }
    }
}