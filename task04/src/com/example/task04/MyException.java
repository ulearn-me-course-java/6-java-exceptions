package com.example.task04;

public class MyException extends IllegalArgumentException{

    MyException(String message, Throwable cause){
        super(message, cause);
    }

    MyException(String format){
        super(format);
    }

}
