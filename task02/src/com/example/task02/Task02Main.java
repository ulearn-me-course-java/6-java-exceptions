package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        if (monthNumber >=3 && monthNumber <= 5 ){
            return "spring";
        }
        else if (monthNumber >= 6 && monthNumber <= 8){
            return "summer";
        }
        else if (monthNumber >= 9 && monthNumber <= 11){
            return "fall";
        }
        else if (monthNumber > 12 || monthNumber < 1){
            throw new IllegalArgumentException("monthNumber " + monthNumber + "is invalid, month number should be between 1..12");
        }
        return "winter";
    }
}