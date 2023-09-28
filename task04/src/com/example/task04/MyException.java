package com.example.task04;

public class MyException extends IllegalArgumentException {

    public MyException(int monthNumber) {
        this("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
