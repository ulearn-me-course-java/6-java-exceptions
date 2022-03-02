package com.example.task03;

import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        throwCheckedException();
    }

    public static void throwCheckedException() throws IOException {
        FileReader file = new FileReader("nonexistent_file.class");
        file.read();
    }
}