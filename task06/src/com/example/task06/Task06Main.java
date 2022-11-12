package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
    }

    void printMethodName() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.print(e.getStackTrace()[1].getMethodName());
        }
    }

}