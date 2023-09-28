package com.example.task06;

import java.io.IOException;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        try{
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.print(e.getStackTrace()[1].getMethodName());
        }
    }
}