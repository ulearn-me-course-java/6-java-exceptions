package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            String message = String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber);
            throw new MyException(message);
        }

        String season;

        if (3 <= monthNumber && monthNumber <= 5) {
            season = "весна";
        } else if (6 <= monthNumber && monthNumber <= 8) {
            season = "лето";
        } else if (9 <= monthNumber && monthNumber <= 11) {
            season = "осень";
        } else {
            season = "зима";
        }

        return season;
    }

}