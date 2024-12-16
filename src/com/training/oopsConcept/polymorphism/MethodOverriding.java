package com.training.oopsConcept.polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {


        Processor mathProcessor = new MathProcessor();// polymorphism
//        MathProcessor mp  = new Processor();
//        mathProcessor.process(2,3);
//
        MathProcessor mp1 =  new MathProcessor();// self
//        mp1.process(3,5);
//        Processor mp2 = mp1;  //  through parent
//        mp2.process(4,5);
//
//        mp1.process(5);

        mathProcessor.process("Rahul");
        MathProcessor.process("Mohan");
//5!

    }
}
