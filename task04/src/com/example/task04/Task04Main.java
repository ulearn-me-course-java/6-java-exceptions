package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12)
        throw new MyException("monthNumber "+ monthNumber + " is invalid, month number should be between 1..12");

        if (monthNumber <= 2 || monthNumber==12)
        return "зима";
        if (monthNumber <= 5)
            return "весна";
        if (monthNumber <= 8)
            return "лето";
        if (monthNumber <= 11)
            return "осень";

        return null;

    }
}
