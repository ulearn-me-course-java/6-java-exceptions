package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        new Task06Main().printMethodName();
         */
    }

    void printMethodName() {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
        System.out.printf("%s", ste.getMethodName());
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}