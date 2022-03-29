package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-3));
    }

    static String getSeason(int monthNumber) {

        String season = new String();

        if((monthNumber > 0 && monthNumber <= 2) || monthNumber == 12)
            season = "зима";
        else if (monthNumber > 2 && monthNumber <= 5)
            season = "весна";
        else if (monthNumber > 5 && monthNumber <= 8)
            season = "лето";
        else if (monthNumber > 8 && monthNumber <= 11)
            season = "осень";
        else if(monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, " +
                    "month number should be between 1..12");


        return season;
    }
}