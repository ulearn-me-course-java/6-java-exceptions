package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();
            System.out.print(methods[2].getMethodName());
    }

}