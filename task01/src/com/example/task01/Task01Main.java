package com.example.task01;

import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) {

        codeWithNPE();
    }

    static void codeWithNPE() {
        Scanner scan = new Scanner(System.in);

        scan = null;

        scan.hasNext();
    }
}
