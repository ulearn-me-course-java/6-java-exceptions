package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        //тест
        codeWithNPE();
    }

    static void codeWithNPE() {
        String temp = null;
        temp.toLowerCase();
    }
}
