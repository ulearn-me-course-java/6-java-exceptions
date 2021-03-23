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
        String result = monthNumber < 3 || monthNumber == 12 ? "зима" : monthNumber < 6 ? "весна" : monthNumber < 9 ? "лето" : "осень";
        if(monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        return result;
    }
}