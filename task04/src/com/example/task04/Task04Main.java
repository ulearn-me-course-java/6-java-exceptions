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
        //return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (monthNumber > 0 && monthNumber < 13) {
            if (monthNumber < 3 || monthNumber == 12)
                return "зима";
            else if (monthNumber < 6)
                return "весна";
            else if (monthNumber < 9)
                return "лето";
            else
                return "осень";
        } else
            throw new MyException(monthNumber);
    }

}