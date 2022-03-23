package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    enum Season{
        зима,       //12 - 2
        весна,      //3 - 5
        лето,       //6-8
        осень       //9-11
    }
    static String getSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12)
            return Season.values()[(monthNumber % 12) / 3].name();
        else
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
    }


}