package com.example.task03;

public class Task03Main {
    public static void main(String[] args) throws Exception {
        Tests tests = new Tests();
        tests.testThrowCheckedException();
    }

    public static void throwCheckedException() throws Exception {
        throw new Exception();
    }
}