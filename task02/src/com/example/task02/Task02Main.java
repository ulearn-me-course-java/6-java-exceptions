package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
            if (monthNumber < 1 || monthNumber > 12) {
                String message = String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber);
                throw new IllegalArgumentException(message);
            }

            if (3 <= monthNumber && monthNumber <= 5) {
                return "весна";
            }
            else if (6 <= monthNumber && monthNumber <= 8) {
                return "лето";
            }
            else if (9 <= monthNumber && monthNumber <= 11) {
                return "осень";
            }
            else {
                return "зима";
            }
        }
    }
