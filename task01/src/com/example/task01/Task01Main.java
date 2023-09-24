package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testCodeWithNPE();
    }

    static void codeWithNPE() {
        throw new NullPointerException();
    }
}
