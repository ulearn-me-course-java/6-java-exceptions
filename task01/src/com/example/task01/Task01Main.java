package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }
//насколько я понял, здесь требуется обратиться к null-ссылке
    static void codeWithNPE() {
        Object example = null;
        example.toString();
    }
}

/* более расширенно на примере:
public class Task01Main {
    public static void main(String[] args) {
        Point one = new Point();
        System.out.print(one.getOne());
    }

class Point{
    public static String a = null;
    public static int getOne(){
        return a.length();
    }
}
 */