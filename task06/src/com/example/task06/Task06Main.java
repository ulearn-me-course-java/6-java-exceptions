package com.example.task06;

public class Task06Main
{
    public static void main(String[] args)
    {
        new Task06Main().printMethodName();
    }

    void printMethodName()
    {
        Exception e = new Exception();
        StackTraceElement[] stack = e.getStackTrace();
        System.out.print(stack[1].getMethodName());
    }
}