package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        Task06Main t = new Task06Main();
        t.printMethodName();
    }

    void printMethodName() {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}