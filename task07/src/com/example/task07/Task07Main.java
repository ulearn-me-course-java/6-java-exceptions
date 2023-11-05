package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) throws Exception {
        Tests tests = new Tests();
        tests.testCountExceptions_checked();
        tests.testCountExceptions_none();
        tests.testCountExceptions_unchecked();
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;
        } catch (Error | RuntimeException e) {
            return UNCHECKED;
        }catch (Exception e) {
            return CHECKED;
        }
    }
}