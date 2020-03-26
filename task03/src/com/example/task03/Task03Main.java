package com.example.task03;
import java.io.IOException; //ошибка ввода-вывода

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        throwCheckedException();
         */
    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws IOException {  //указ на то, что отсюда явно вылетает IOException
        throw new IOException();
    }
}