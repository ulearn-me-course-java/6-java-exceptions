package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        if ((monthNumber < 1) || (monthNumber > 12))
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");

        String[] seasons = {"зима", "весна", "лето", "осень"};
        return seasons[monthNumber/3%4];
    }
}