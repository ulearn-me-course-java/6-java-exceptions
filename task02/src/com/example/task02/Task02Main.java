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
        if (monthNumber > 12 || monthNumber < 1)
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        return monthNumber == 12 || monthNumber <= 2 ? "зима" :
                monthNumber <= 5 ? "весна" :
                        monthNumber <= 8 ? "лето" : "осень";
    }
}