package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        if ((monthNumber < 1) || (monthNumber > 12))
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");

        String[] seasons = {"зима", "весна", "лето", "осень"};
        return seasons[monthNumber/3%4];
    }

}