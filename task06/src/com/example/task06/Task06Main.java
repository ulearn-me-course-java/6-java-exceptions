package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try{
            throw new Throwable();
        }catch (Throwable t){
            System.out.println(t.getStackTrace()[1].getMethodName());
        }
    }

}