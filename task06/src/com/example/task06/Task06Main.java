package com.example.task06;

import sun.management.MethodInfo;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
            /*В книгах пишут что в СТЕКУ все индексы начинаются с 0-ля, так как и в масивах,
                но здесь логика такая:
                getStackTrace - [0]
                method5 - [1]
                method4 - [2] */
    }

}