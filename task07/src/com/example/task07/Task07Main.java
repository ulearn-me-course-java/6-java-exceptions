package com.example.task07;

import java.io.IOException;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process(); //todo вы можете заменить реализацию этого метода для ручного дебага
        } catch (Exception e) {
            return (e instanceof IOException) ? "checked" : "unchecked";
        }
        return NONE;
    }

}