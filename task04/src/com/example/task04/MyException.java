package com.example.task04;

public class MyException extends IllegalArgumentException {
    private String message;

    MyException(String message){
        setMessage(message);
        getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
