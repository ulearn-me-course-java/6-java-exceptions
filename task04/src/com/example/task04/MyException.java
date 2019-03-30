package com.example.task04;

public class MyException extends IllegalArgumentException {
    public MyException(int numb){
        super(String.format("monthNumber %d is invalid, month number should be between 1..12", numb));
    }
}
