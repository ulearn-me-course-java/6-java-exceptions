package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            StackTraceElement[] ste = e.getStackTrace();
            System.out.print(ste[1].getMethodName());
            //for(StackTraceElement s : ste) System.out.println(s.getMethodName());
        }
    }

}