package com.example.task05;

import java.io.*;
import java.text.MessageFormat;

public class Task05Main {
    public static void main(String[] args){
        String pathToFile = args[0]; // "/home/user/file.txt"
        String s = null;
        try {
            s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            String str = String.format("файл \"%s\" не найден\n", pathToFile);
            System.out.printf(str);
        } catch (IOException e){
            String str = String.format("произошла ошибка при чтении файла \"%s\"", pathToFile);
            System.out.printf(str);
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