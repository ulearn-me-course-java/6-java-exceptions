package com.example.task01;

public class Task01Main {
    static StringBuilder builder;
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        builder.append("a");
    }
}
