package com.example.task03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task03Main {
    public static void main(String[] args) throws IOException{
        throwCheckedException();
    }

    public static void throwCheckedException() throws IOException {
        List<String> s = Files.readAllLines(Paths.get("/"));
    }
}