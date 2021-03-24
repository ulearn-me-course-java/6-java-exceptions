package com.example.task06;

import jdk.jfr.StackTrace;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        System.out.print(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

}