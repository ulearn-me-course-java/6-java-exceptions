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
        String seasonName;

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return seasonName = "зима";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            seasonName = "весна";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            seasonName = "лето";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            seasonName = "осень";
        } else {
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        return seasonName;
    }

}
