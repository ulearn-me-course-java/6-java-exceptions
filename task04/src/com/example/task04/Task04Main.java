package com.example.task04;

import java.text.MessageFormat;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                return "зима";
            case 3:
            case 4:
            case 5:
                return "весна";
            case 6:
            case 7:
            case 8:
                return "лето";
            case 9:
            case 10:
            case 11:
                return "осень";
            default:
                throw new MyException(MessageFormat
                        .format("monthNumber {0} is invalid, month number should be between 1..12", monthNumber));
        }
    }
}