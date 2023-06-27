package com.example.task03;

import java.io.*;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args){
        try {
            throwCheckedException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void throwCheckedException() throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner scanner = new Scanner(file);
    }
}