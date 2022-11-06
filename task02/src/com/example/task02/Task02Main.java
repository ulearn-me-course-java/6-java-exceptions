package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++)
            System.out.println(getSeason(i));
    }

    static String getSeason(int monthNumber) {
        if(monthNumber > 12 || monthNumber < 1) throw new IllegalArgumentException(
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