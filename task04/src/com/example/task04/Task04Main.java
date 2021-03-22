package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new MyException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
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