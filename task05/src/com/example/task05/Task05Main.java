package com.example.task05;

import java.io.*;
import java.util.InputMismatchException;

public class Task05Main {
    public static void main(String[] args) {

        String pathToFile = args[0]; // "/home/user/file.txt"
        try{
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e){
            System.out.print("файл \""+  pathToFile + "\" не найден\n");
        } catch (IOException e){
            System.out.println("произошла ошибка при чтении файла " + pathToFile);
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