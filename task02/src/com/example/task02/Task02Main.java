package com.example.task02;
import java.util.HashMap;
import java.util.Map;
public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        Map<String, int[]> dictionary = new HashMap<>();
        dictionary.put("зима", new int[] {12, 1, 2});
        dictionary.put("весна", new int[] {3, 4, 5});
        dictionary.put("лето", new int[] {6, 7, 8});
        dictionary.put("осень", new int[] {9, 10,11} );

        for (String key : dictionary.keySet()){
            if (inArray(dictionary.get((key)), monthNumber)){
                return key;
            }
        }
        throw new IllegalArgumentException("monthNumber "+monthNumber+" is invalid, month number should be between 1..12");
    }

    public static boolean inArray(int[] array, int toFind) {
        for (int element : array) {
            if (element == toFind) {
                return true;
            }
        }
        return false;
    }
}