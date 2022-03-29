package com.example.task01;

public class Task01Main {

    private static Object obj = null;

    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        obj.toString();
    }
}
