package com.example.task04;

public class MyException extends IllegalArgumentException {
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(String format) {
        super(format);
    }
}
