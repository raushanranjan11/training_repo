package com.training.oopsConcept.polymorphism;

class MathProcessor extends Processor {

    @Override
    public void process(int i, int j) {
        System.out.println("Sum of integers is " + (i + j));
    }

    @Override
    public void process(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Sum of integer array elements is " + sum);
    }
    public void process(int i) {
        System.out.printf("Processing two integers:%d",  i);
    }

    public static void process(String name) {
        System.out.println("Processing of MathProcessor "+  new StringBuilder(name).reverse());
    }
}

//// armstong//Fibonacci
////the Frequency of Each Character in a String
////Java Math
//Reverse an Array
//        Block Scope and Shadowing
