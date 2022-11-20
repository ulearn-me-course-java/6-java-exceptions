package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        System.out.print(stackTraceElements[1].getMethodName());
    }

}