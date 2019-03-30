package com.example.task07;

public class Processor {
    static int numEx = 0;

    public Object process() throws Exception {
        switch (numEx++) {
            case 0:
                throw new Exception();
            case 1:
                throw new RuntimeException();
        }
        return null;
    }

}
