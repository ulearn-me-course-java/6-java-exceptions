package com.example.task04;

public class MyException extends IllegalArgumentException {
    MyException(String line) {
            super(line);
    }
}
