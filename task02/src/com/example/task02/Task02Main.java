package com.example.task02;

import java.time.Month;

public class Task02Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testGetSeason_shouldFailWhenNegativeMonthNumber();
        tests.testGetSeason_shouldFailWhenZeroMonthNumber();
        tests.testGetSeason_withCorrectInput();
        tests.testGetSeason_shouldFailWhenTooBigMonthNumber();
    }

    static String getSeason(int monthNumber) {
        if (monthNumber>12||monthNumber<=0){
            throw new IllegalArgumentException(String.format("monthNumber %s is invalid, month number should be between 1..12",monthNumber));
        }
        String res = "весна";
        if (monthNumber==1||monthNumber==2||monthNumber==12){
            res = "зима";
        }else if (monthNumber>5 && monthNumber<9){
            res = "лето";
        } else if (monthNumber>8 && monthNumber<12){
            res = "осень";
        }
        return res;
    }
}