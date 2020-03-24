package com.example.task04;

public class Task04Main {


    public static void main(String[] args)  {
        System.out.println(getSeason(0));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber <= 0 || monthNumber > 12)
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        else if (monthNumber <= 2 || monthNumber == 12)
            return "зима";
        else if (monthNumber >= 3 && monthNumber <= 5)
            return "весна";
        else if (monthNumber <= 8 && monthNumber >= 6)
            return "лето";
        else return "осень";
    }

}