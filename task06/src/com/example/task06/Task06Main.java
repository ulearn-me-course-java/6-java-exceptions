package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.print(ste[2].getMethodName());
    }
}