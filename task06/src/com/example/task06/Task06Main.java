package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] callerName = Thread.currentThread().getStackTrace();
        String name = callerName[2].getMethodName();
        System.out.print(name);
    }

}