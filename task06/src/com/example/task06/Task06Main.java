package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println(e.getStackTrace()[1].getMethodName());
        }
    }
}