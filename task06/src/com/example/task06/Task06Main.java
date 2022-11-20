package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        Throwable t = new Throwable();
        StackTraceElement[] elems = t.getStackTrace();
        System.out.print(elems[1].getMethodName());
    }

}