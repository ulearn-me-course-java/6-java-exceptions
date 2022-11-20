package com.example.task03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task03Main {
    public static void main(String[] args) throws FileNotFoundException{
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        throwCheckedException();

    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws FileNotFoundException {
        File file = new File("myFile");
        FileInputStream fis = new FileInputStream(file);
        System.out.println("Hello");
    }
}