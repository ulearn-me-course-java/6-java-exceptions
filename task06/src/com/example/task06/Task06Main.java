package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement sTE;
        sTE = new Exception().getStackTrace()[1];
        System.out.print(sTE.getMethodName());
    }

}
