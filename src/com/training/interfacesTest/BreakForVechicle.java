package com.training.interfacesTest;

public interface BreakForVechicle {

    int drumBreak();


    default int slowDownBydiskBreak() {
        return 5;
    }
    static int slowDownByhydraulicBreak(){
        return 10;
    }

    default boolean   turnAlarmOn() {
        // custom implementation

        System.out.println("BreakForVechicle interface ");

        return true;
    }


}
