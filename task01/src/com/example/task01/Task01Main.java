package com.example.task01;

import java.math.BigDecimal;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        BigDecimal[] a = new BigDecimal[1];
        a[0].add(BigDecimal.valueOf(1));
    }
}
