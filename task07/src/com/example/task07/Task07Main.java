package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        Task07Main t = new Task07Main();
        System.out.println(t.getExceptionType());
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;
        } catch (Exception e) {
            if (e instanceof RuntimeException)
                return UNCHECKED;
            else return CHECKED;
        }
    }
}