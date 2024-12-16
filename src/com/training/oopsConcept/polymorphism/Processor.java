package com.training.oopsConcept.polymorphism;

import java.util.Arrays;

public class Processor {

    public void process(int i, int j) {
        System.out.printf("Processing two integers:%d, %d", i, j);
        System.out.println();//   ---
    }
    public int process(int i, long j) {//
        System.out.printf("Processing two integers:%d, %d", i, j);
        return 1;
    }
//2434354435456 -  232434
    public void process(int[] ints) {
        System.out.println("Adding integer array:" + Arrays.toString(ints));
    }

    public void process(Object[] objs) {
        System.out.println("Adding integer array:" + Arrays.toString(objs));
    }

    public void process(int i) throws Exception{
        System.out.printf("Processing two integers:%d",  i);
    }



    public static void process(String name) {
        System.out.println("Processing of Processor "+  name);
    }
}
