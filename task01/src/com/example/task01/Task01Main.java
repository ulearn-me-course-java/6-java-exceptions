package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testCodeWithNPE();
    }

    static void codeWithNPE() {
        Integer a = null;
        int b = 0;
        b += a;
    }
}
