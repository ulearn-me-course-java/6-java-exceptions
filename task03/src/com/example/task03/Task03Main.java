package com.example.task03;

import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        throwCheckedException();
    }

    public static void throwCheckedException() throws IOException {
        throw new IOException();
    }
}