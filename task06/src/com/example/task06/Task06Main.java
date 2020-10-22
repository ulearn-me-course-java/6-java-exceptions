package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement str = Thread.currentThread().getStackTrace()[2];
        System.out.print(str.getMethodName());
    }

}