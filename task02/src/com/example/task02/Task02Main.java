package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        getSeason(14);
    }

    static String getSeason(int monthNumber) {

            if( (monthNumber <= 2 && monthNumber >= 1) || monthNumber == 12){
                return "зима";
            }
            else if(monthNumber <= 5 && monthNumber >= 3){
                return "весна";
            }
            else  if(monthNumber <= 8 && monthNumber >= 6){
                return "лето";
            }
            else if (monthNumber >= 9 && monthNumber <= 11){
                return "осень";
            }
            else{
                throw new IllegalArgumentException
                        (String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
            }
    }
}