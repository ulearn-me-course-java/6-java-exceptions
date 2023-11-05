package com.example.task01;

import java.util.List;

public class Task01Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testCodeWithNPE();
    }

    //static List<Integer> a;
    static void codeWithNPE() {
        throw new NullPointerException();
        //a.add(new Integer(12));
    }
}
