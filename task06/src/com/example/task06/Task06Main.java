package com.example.task06;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        System.out.print(new Exception().getStackTrace()[1].getMethodName());
    }

}