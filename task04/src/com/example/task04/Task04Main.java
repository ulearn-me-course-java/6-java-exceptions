package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
            if (monthNumber > 12 || monthNumber < 1)
                throw new MyException("monthNumber "+monthNumber+" is invalid, month number should be between 1..12");
            else {
                if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) return "зима";
                if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) return "весна";
                if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) return "лето";
            }
            return "осень";
    }

}
class MyException extends IllegalArgumentException {
    public MyException (String messege){
        super(messege);
    }
}