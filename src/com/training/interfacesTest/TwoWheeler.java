package com.training.interfacesTest;

public class TwoWheeler implements  Vechicle,BreakForVechicle{
    @Override
    public int getSpeed() {
        return 50;
    }

    @Override
    public int drumBreak() {
        return Vechicle.super.drumBreak();
    }

    @Override
    public boolean turnAlarmOn() {
        return BreakForVechicle.super.turnAlarmOn();
    }


    @Override
    public int slowDownBydiskBreak() {
        return BreakForVechicle.super.slowDownBydiskBreak();
    }
}
