package com.example.task04;

import lombok.NonNull;

public class MyException extends IllegalArgumentException {
    public MyException(@NonNull String message) {
        super(message);
    }
}
