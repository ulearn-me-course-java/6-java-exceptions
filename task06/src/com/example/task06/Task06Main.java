package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[0].toString());
        System.out.println(stackTrace[1].toString());
        System.out.println(stackTrace[2].toString());
        System.out.print(stackTrace[2].getMethodName());
    }

}