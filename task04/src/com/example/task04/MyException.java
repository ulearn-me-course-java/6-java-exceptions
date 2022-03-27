package com.example.task04;

public class MyException extends IllegalArgumentException {
    public MyException(int arg) {
        super("monthNumber " + arg + " is invalid, month number should be between 1..12");
    }
}
