package com.example.task01;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        String nu = null;
        nu.length();
    }
}
