package com.training.staticExample;

public   class StaticTest {
    /*Variable (also known as a class variable)
    Method (also known as a class method)
    Block
    Nested class*/

    private static String book = "Novel";
    private  String food = "food";

    static{
        book = "JAva";
        System.out.println("Java Training static block");
    }
    public static void main(String[] args) {
        System.out.println("Java Training main block");


        StaticTest.StaticNestedInner staticNestedInner = new StaticTest.StaticNestedInner();
        System.out.println("Sum for two integer : "+staticNestedInner.sum(5,9));

        System.out.println(book);


    }

    static class StaticNestedInner{

//        private int a;
//        private int b;

        public  int sum(int a, int b){
            return a+b;
        }
    }
}
 class StaticNestedInner1{

//        private int a;
//        private int b;

    public  int sum(int a, int b){
        return a+b;
    }
}
//---------java6-------

    /*Java Training static block
        java.lang.NoSuchMethodError: main
        Exception in thread "main"
        Process finished with exit code 1*/

/*
Error: Main method not found in class com.training.staticExample.StaticTest,
 please define the main method as:
public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application*/
