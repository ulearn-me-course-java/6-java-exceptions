package com.example.task03;

import com.sun.org.omg.CORBA.ExceptionDescription;
import jdk.jfr.events.ExceptionThrownEvent;

import java.io.*;

public class Task03Main
{
    public static void main(String[] args)
    {
        //throwCheckedException();
    }

    public static void throwCheckedException() throws Exception
    {
        throw new Exception();
    }
}