package com.example.task07;

import java.util.logging.Logger;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() throws Exception{

        try {
            processor.process();
        } catch (RuntimeException | Error un) {
            return Task07Main.UNCHECKED;
        } catch (Throwable ch) {
            return Task07Main.CHECKED;
        }

        return Task07Main.NONE;
    }

}