package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
        codeWithNPE();
    }

    static void codeWithNPE() {
        Object s=null;
        System.out.println(s.toString());
    }
}