package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
    }

    public void printMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[2];
        String methodName = stackTraceElement.getMethodName();
        System.out.print(methodName);
    }
}