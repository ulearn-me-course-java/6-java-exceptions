package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    public static String getSeason(int monthNumber) {
        if (monthNumber > 0 && monthNumber < 3 || monthNumber == 12) {
            return "зима";
        } else if (monthNumber > 2 && monthNumber < 6) {
            return "весна";
        } else if (monthNumber > 5 && monthNumber < 9) {
            return "лето";
        } else if (monthNumber > 8 && monthNumber < 12) {
            return "осень";
        } else {
            throw new MyException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
    }

}