package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testGetSeason_withCorrectInput();
        tests.testGetSeason_shouldFailWhenNegativeMonthNumber();
        tests.testGetSeason_shouldFailWhenTooBigMonthNumber();
        tests.testGetSeason_shouldFailWhenZeroMonthNumber();
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber >= 1 && monthNumber <= 2) {
            return "зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "осень";
        }
        throw new IllegalArgumentException(
                String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
    }
}