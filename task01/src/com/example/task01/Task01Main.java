package com.example.task01;

import java.util.Objects;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        codeWithNPE();

    }

    static void codeWithNPE() {
        Object obj = null;
        System.out.println(obj.toString());
    }
}
