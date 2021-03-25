package com.example.task06;

public class Task06Main {
    void printMethodName() {
        System.out.print(new Exception().getStackTrace()[1].getMethodName());
    }

}