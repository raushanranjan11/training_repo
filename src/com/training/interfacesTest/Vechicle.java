package com.training.interfacesTest;

public interface Vechicle {

    static int speed= 40;
    String brand = "Suzuki";

    public  abstract int getSpeed();


    default int drumBreak(){

        return  0;
    }


    static String makeSound(){

        return  "hooooo";
    }









    default boolean   turnAlarmOn() {
        // custom implementation
        System.out.println("Vechicle interface ");
        return false;
    }
}
