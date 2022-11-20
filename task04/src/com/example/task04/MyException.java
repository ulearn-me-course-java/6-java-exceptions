package com.example.task04;

public class MyException extends IllegalArgumentException{

    public MyException(String format) {
        super(format);
    }

    public MyException(String format, Throwable cause) {
        super(format,cause);
    }
}
