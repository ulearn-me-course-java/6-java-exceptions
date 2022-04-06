package com.example.task03;

public class Task03Main {
    public static void main(String[] args) throws IOException{
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        throwCheckedException();
         */
    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() {
        String path = "someFile.doesntExit";
        File file = new File(path);
        FileInputStream stream = new FileInputStream(file);
    }
}
