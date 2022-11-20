package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        if(monthNumber == 12 || monthNumber < 3) return "зима";
        else if(monthNumber < 6) return "весна";
        else if(monthNumber < 9) return "лето";
        else return "осень";



        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}