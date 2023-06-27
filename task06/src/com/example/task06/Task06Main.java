package com.example.task06;

import jdk.jfr.StackTrace;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }
    void printMethodName() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.printf("%s", ste[2].getMethodName());
        for (int i = 0; i < ste.length; i++) {
            System.out.println(ste[i]);
        }
    }
}