package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(8));
    }

    static String getSeason(int monthNumber) {

        if (monthNumber <= 12 && monthNumber >= 1) {
            if(monthNumber > 2 && monthNumber < 6) return "весна";
            else if(monthNumber >= 6 && monthNumber < 9) return "лето";
            else if(monthNumber >= 9 && monthNumber < 12) return "осень";
            else return "зима";
        }
        else{
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
    }
}