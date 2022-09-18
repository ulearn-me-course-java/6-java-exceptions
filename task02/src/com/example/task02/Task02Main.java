package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
        }
        int season = monthNumber % 12;
        if (season < 3){
            return "зима";
        } else if (season < 6) {
            return "весна";
        } else if (season < 9) {
            return "лето";
        }
        return "осень";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}