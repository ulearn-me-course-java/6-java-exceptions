package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        throwCheckedException();
         */
    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws Exception{
        int[] array = {0,5,6,8};
        try {
            int i = array[7];
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}