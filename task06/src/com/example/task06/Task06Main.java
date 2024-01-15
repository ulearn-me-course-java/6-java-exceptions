package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); //стек вызовов
        String callingMethod = stackTraceElements[2].getMethodName();
        System.out.print(callingMethod);
        //System.out.println("Метод, вызвавший printMethodName(): " + callingMethod);
    }
}