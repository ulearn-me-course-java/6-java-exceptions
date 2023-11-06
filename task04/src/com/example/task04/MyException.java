package com.example.task04;

public class MyException extends IllegalArgumentException {
    public MyException(String detailingMessage) {
        super(detailingMessage);
    }
}