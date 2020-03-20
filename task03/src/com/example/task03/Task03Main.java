package com.example.task03;

import java.io.FileWriter;
import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) throws Exception {
        throwCheckedException();
    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws IOException {
        FileWriter fileWriter = new FileWriter("out.txt");
        fileWriter.close();
        fileWriter.write("Хьюстон, у нас проблема");
    }
}