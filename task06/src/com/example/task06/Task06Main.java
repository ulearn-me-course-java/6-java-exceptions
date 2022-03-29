package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        String name = stack[1].getMethodName();
        System.out.print(name);
    }

}