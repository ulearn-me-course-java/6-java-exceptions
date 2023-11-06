package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        try {
            System.out.println(getSeason(-5));
        } catch (MyException ignored) {

        }
    }

    static String getSeason(int monthNumber) throws MyException {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new MyException(
                    "monthNumber " + monthNumber + " is invalid, month number should be between 1..12"
            );
        }

        if (3 <= monthNumber && monthNumber <= 5) {
            return "весна";
        } else if (6 <= monthNumber && monthNumber <= 8) {
            return "лето";
        } else if (9 <= monthNumber && monthNumber <= 11) {
            return "осень";
        } else {
            return "зима";
        }
    }
}