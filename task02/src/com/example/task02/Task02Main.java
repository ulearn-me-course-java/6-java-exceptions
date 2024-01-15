package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        try {
            int monthNumber = 10;
            String season = getSeason(monthNumber);
            System.out.println("Месяц " + monthNumber + " соответствует времени года: " + season);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("monthNumber " + monthNumber +
                    " is invalid, month number should be between 1..12");
        }

        if (monthNumber <= 2 || monthNumber == 12) {
            return "зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else {
            return "осень";
        }
    }
}