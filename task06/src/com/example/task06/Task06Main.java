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
        //Thread current = Thread.currentThread();
        Throwable t = new Throwable();
        System.out.print(t.getStackTrace()[1].getMethodName());
    }

}