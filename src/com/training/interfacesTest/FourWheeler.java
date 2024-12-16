package com.training.interfacesTest;

public class FourWheeler implements Vechicle,BreakForVechicle{
    public int getSpeed() {

        return 20;
    }
//
    @Override
    public int drumBreak() {
        return Vechicle.super.drumBreak();
    }

    @Override
    public boolean turnAlarmOn() {
        return Vechicle.super.turnAlarmOn();
    }

    @Override
    public int slowDownBydiskBreak() {
        return BreakForVechicle.super.slowDownBydiskBreak();
    }
}
