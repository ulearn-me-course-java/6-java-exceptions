package com.example.task04;

public class MyException extends IllegalArgumentException{
    public MyException(int incorrectArg){
        super("monthNumber " + incorrectArg + " is invalid, month number should be between 1..12");
    }
}
