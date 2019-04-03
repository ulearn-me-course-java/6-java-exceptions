package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    private static String[] months = new String[] {"зима","зима","весна","весна","весна","лето","лето","лето","осень","осень","осень","зима"};

    static String getSeason(int monthNumber) {
        try {
            return months[monthNumber - 1];//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        }
        catch(ArrayIndexOutOfBoundsException e){ throw new IllegalArgumentException("monthNumber " + monthNumber +" is invalid, month number should be between 1..12");}
    }
}