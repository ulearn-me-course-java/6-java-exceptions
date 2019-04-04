package com.example.task06;

import java.io.PrintStream;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        System.setProperty("line.separator", "\n");
        PrintStream ps = new PrintStream(System.out);
        ps.print(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

}