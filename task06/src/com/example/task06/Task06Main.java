package com.example.task06;

import javax.imageio.IIOException;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        new Task06Main().printMethodName();
         */
    }

    void printMethodName() {
        System.out.println(new Throwable().getStackTrace()[1].getMethodName());
    }

}