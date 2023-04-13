package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++)
            System.out.println(getSeason(i));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
        }
        String result;
        if (monthNumber == 12 || monthNumber < 3) {
            result = "зима";
        } else if (monthNumber < 6) {
            result = "весна";
        } else if (monthNumber < 9) {
            result = "лето";
        } else {
            result = "осень";
        }
        return result;
    }
}