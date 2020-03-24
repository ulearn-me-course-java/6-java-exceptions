package com.example.task03;

import com.sun.xml.internal.ws.api.model.CheckedException;


public class Task03Main {
    public static void main(String[] args) {
        throwCheckedException();
    }

    public static void throwCheckedException()  throws RuntimeException{
        throw new RuntimeException();
    }
}