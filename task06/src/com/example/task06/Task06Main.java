package com.example.task06;

import sun.reflect.Reflection;

import javax.imageio.IIOException;
import java.lang.reflect.Method;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        new Task06Main().printMethodName();
         */
    }

    void printMethodName() {
        //System.out.println(new Throwable().getStackTrace()[1].getMethodName());
        String name = Reflection.getCallerClass(2).getMethods()[2].getName();
        System.out.println(name);
    }

}