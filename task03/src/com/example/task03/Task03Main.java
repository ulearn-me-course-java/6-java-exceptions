package com.example.task03;

import java.io.FileNotFoundException;

public class Task03Main {
    public static void main(String[] args) {
        throwCheckedException();
    }

    public static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}