package com.example.task06;
import sun.util.logging.resources.logging;

import java.util.logging.*;
public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();
    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.print(e.getStackTrace()[1].getMethodName());
        }
    }
}