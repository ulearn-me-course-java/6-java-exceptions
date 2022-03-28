package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        NullPointerException ex = null;
        try {
            ex.getMessage();
        }catch (Throwable e){
            System.out.println(e.getClass());
        }
    }
}
