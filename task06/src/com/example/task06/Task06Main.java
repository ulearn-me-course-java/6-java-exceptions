package com.example.task06;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        try{
            throw new Exception();
        }catch (Exception exception){
            System.out.print(exception.getStackTrace()[1].getMethodName());
        }
    }

}