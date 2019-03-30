package com.example.task04;

class MyException extends IllegalArgumentException {
    MyException(String s) {
        this(s, new Throwable());
    }

    private MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
