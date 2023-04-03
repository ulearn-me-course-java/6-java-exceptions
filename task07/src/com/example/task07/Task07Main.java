package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        System.out.println(new Task07Main().getExceptionType());
    }

    public Processor processor = new Processor();

    public String getExceptionType() {
        try {
            processor.process();
        } catch (RuntimeException exception){
            return UNCHECKED;
        } catch (Exception exception) {
            return CHECKED;
        }
        return NONE;
    }

}