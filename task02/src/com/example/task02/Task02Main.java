package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int m) {
        if (m <= 0 || m >= 13)
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", m));
        return m >= 3 && m <= 5 ? "весна" :
                m >=6 && m <= 8 ? "лето" :
                m >=9 && m <= 11 ? "осень" : "зима";
    }
}