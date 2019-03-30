package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        Task06Main t = new Task06Main();

        t.printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();


        for (int i = 0; i < st.length; i++) {
            if (st[i].getMethodName() == "printMethodName") {
                System.out.println(st[i+1].getMethodName());
                break;
            }
        }
    }
}