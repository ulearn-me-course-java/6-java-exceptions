package com.example.task05;

import java.io.*;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // "/home/user/file.txt"

        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        }
        catch(FileNotFoundException exp) {
            System.out.print(String.format("файл \"%s\" не найден\n", pathToFile));
        }
        catch (IOException exp) {
            System.out.println(String.format("произошла ошибка при чтении файла \"%s\"", pathToFile));
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