package com.example.task02;

import java.lang.invoke.SwitchPoint;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(5));
    }

    static String getSeason(int monthNumber) {
        String month = "";
        if (monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) {
            month = "зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            month = "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            month = "лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            month = "осень";
        }
        else {
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        return month;
    }
}