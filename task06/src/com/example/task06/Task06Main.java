package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        try {
            throw new Exception("exception");
        } catch (Exception ex) {
            System.out.print(ex.getStackTrace()[1].getMethodName());
        }
    }
}