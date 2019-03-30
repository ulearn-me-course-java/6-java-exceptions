package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        String[] season = {"зима", "весна", "лето", "осень"};
        if (monthNumber < 1 || monthNumber > 12)
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        return season[monthNumber % 12 / 3];
    }
}