package com.example.task06;

import java.util.Stack;
import java.util.logging.*;

public class Task06Main
{

    public static void main(String[] args)
    {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        new Task06Main().printMethodName();

    }

    void printMethodName()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        /*
        for (StackTraceElement elem : stackTraceElements)
        {
            System.out.println(elem.getMethodName());
        }
         */
        System.out.print(stackTraceElements[2].getMethodName());
    }

}