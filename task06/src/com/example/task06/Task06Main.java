package com.example.task06;

import jdk.jfr.internal.Logger;

import java.util.logging.Level;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        final Throwable t = new Throwable();
        // 1 - это вызываемый метод (calledMethod);
        final StackTraceElement methodCaller = t.getStackTrace()[1];
        System.out.print(methodCaller.getMethodName());
    }

}