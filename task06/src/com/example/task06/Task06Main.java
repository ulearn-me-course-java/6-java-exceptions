package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

    public void printMethodName() {
        StackTraceElement[] arr = (new Throwable()).getStackTrace();
        String method = arr[1].getMethodName();
        System.out.print(method);
    }

}