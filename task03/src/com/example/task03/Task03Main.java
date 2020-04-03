package com.example.task03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        throwCheckedException();
         */
    }

    public static void throwCheckedException() throws IOException {
        FileWriter  newFileWriter = new FileWriter("C://Users//kater//Desktop//Semester.txt");
        newFileWriter.close();
        newFileWriter.write("Друид-мизантроп вылез из пещеры");
    }
}

