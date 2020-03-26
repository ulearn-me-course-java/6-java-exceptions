package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        String type = "none";

        try {
            processor.process();
        } catch (Exception e) {
            if(e instanceof RuntimeException)
                type = "unchecked";
            else
                type = "checked";
        }
        return type;
    }

}