package com.example.task04;

public class MyException extends IllegalArgumentException{
    public MyException(int num) {
        super(String.format("monthNumber %d is invalid, month number should be between 1..12", num));
    }
}
