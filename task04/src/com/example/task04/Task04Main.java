package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }
    enum Seasons {зима, весна, лето, осень}
    static String getSeason(int monthNumber) {
        if(monthNumber > 0 && monthNumber < 13) {
            if (monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) return Seasons.зима.toString();
            if (monthNumber >= 3 && monthNumber <= 5) return Seasons.весна.toString();
            if (monthNumber >= 6 && monthNumber <= 8) return Seasons.лето.toString();
            if (monthNumber >= 9 && monthNumber <= 11) return Seasons.осень.toString();
        }
        throw new MyException(String.format
                ("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
    }

}