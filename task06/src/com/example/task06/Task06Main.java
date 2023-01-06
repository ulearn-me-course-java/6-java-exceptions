package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        printMethodName();
    }

    static void printMethodName() {
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        System.out.print(methods[2].getMethodName());
    }

}
