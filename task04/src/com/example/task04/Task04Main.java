package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if(monthNumber > 12 || monthNumber < 1) throw new MyException(
                String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber)
        );

        return monthNumber > 2
                ? monthNumber < 6
                ? "весна"
                : monthNumber < 9
                ? "лето"
                : monthNumber < 12
                ? "осень"
                : "зима"
                : "зима";
    }
}