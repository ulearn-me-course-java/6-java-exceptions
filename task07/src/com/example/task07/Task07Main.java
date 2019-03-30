package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";
    public Processor processor;

    public static void main(String[] args) {
        Task07Main task07Main = new Task07Main();
        System.out.println(task07Main.getExceptionType());
        System.out.println(task07Main.getExceptionType());
        System.out.println(task07Main.getExceptionType());
    }

    public String getExceptionType() {
        try {
            processor.process();
        } catch (RuntimeException e) {
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }
        return NONE;
    }

}