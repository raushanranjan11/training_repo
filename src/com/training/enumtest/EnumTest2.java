package com.training.enumtest;


 interface DaysDetaills{
    String getDaysDetails();
}
public enum EnumTest2 implements DaysDetaills{

    SUNDAY("Sunday"),MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wednesday"), THURSDAY("Thursday"),FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String day;
    EnumTest2(String day){
        this.day = day;
    }

    @Override
    public String getDaysDetails() {
        return day;
    }

    public static void main(String[] args) {
        for (EnumTest2 day:EnumTest2.values()
             ) {
            System.out.println("Days details are : "+ day.getDaysDetails());
        }



    }
}
