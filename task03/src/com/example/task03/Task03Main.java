package com.example.task03;

import java.lang.Exception;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        try {
            throwCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception");
    }
}