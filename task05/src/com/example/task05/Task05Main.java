package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) throws IOException {
        String pathToFile = args[0]; // "/home/user/file.txt"
        //String pathToFile = "/home/user/file.txt";

        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("Файл \"" + pathToFile + "\" не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла \"" + pathToFile + "\"");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(currentLine);
            stringBuilder.append("\n");
        }
        bufferedReader.close();

        return stringBuilder.toString();
    }
}