package com.example.task05;

import java.io.*;

public class Task05Main {
    public static void main(String[] args)  {
        System.setProperty("line.separator", "\n");
        //закоменнтированный ниже вывод жаловался на сепаратор \r в конце строки, из-за этого не проходил тесты
        String pathToFile = args[0]; // "/home/user/file.txt"
        PrintStream ps = new PrintStream(System.out);

        try {
            String s = readFile(pathToFile);
            ps.println(s);
        } catch (FileNotFoundException e){
            //System.out.println(String.format("файл \"%s\" не найден", pathToFile));
            ps.printf("файл \"%s\" не найден\n", pathToFile);
        } catch (IOException e) {
            ps.printf("произошла ошибка при чтении файла \"%s\"\n", pathToFile);
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