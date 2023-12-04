package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        printMethodName();

    }

    static void printMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[2];
        System.out.print(stackTraceElement.getMethodName());
    }

}