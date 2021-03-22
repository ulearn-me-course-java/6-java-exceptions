package com.example.task07;

import java.io.IOException;
import java.util.Random;

public class Processor {

    public Object process() throws Exception {
        Random random = new Random();
        int value = random.nextInt(3);
        if (value == 0) {
            throw new IllegalArgumentException();
        } else if (value == 1) {
            throw new IOException();
        }
        return null;
    }
}
