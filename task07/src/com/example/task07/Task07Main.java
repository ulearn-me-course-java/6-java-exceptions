package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        Tests tests = new Tests();
        try {
            tests.testCountExceptions_unchecked();
            tests.testCountExceptions_none();
            tests.testCountExceptions_checked();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
        } catch (RuntimeException | Error e) {
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }
        return NONE;
    }
}