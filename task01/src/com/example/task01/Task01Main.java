package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        System.out.println("=^._.^=");
    }

    static void codeWithNPE() {
        String str = null;
        str.toUpperCase();
    }
}
