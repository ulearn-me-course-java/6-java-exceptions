package com.example.task01;

import java.util.Arrays;
import java.util.Random;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        Integer num;
        num = null;
        System.out.println(num.intValue());
    }
}
