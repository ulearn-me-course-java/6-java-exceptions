package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
    }

    static void codeWithNPE() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
         String s1 = "";
            String s2 = "";
            String s3 = s1 + s2;
            throw new NullPointerException("Impossible operation !");
    }
}
