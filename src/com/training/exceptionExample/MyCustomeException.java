package com.training.exceptionExample;

import java.io.IOException;

class InvalidNameException extends Exception {
    public InvalidNameException(String s)
    {
        super(s);
    }
}

public class MyCustomeException {
    public static void main(String[] args) throws InvalidNameException {

        String name = "Mayank";
        if(!name.equals("Tripathy")){
            throw new InvalidNameException("Not found exact name");
        }
    }
}