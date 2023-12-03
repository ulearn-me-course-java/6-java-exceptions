package com.example.task05;

import java.io.*;

public class Task05Main {
    public static void main(String[] args) {

        try {
            String pathToFile = args[0]; // "/home/user/file.txt"

            String s = readFile(pathToFile);
            System.out.println(s);
        }catch (FileNotFoundException e){
            System.out.print("файл \"" + args[0] + "\" не найден\n");
        }catch (IOException io){
            System.out.print("произошла ошибка при чтении файла \"" + args[0] +"\"\n");
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