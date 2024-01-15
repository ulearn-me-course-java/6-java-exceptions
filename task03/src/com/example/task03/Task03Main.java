package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println("Поймано checked исключение: " + e.getMessage());
        }
    }

    static void throwCheckedException() throws Exception {
        throw new Exception("Something goes wrong");
    }
}