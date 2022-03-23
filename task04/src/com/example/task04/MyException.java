package com.example.task04;

public class MyException extends IllegalArgumentException{
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }
}
