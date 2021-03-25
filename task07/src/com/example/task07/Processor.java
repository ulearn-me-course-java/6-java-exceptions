package com.example.task07;

import java.util.Random;

public class Processor {

    public Object process() throws Exception {
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            throw new RuntimeException();
        } else {
            throw new Exception();
        }
    }

}
