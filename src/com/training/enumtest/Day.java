package com.training.enumtest;

public enum Day {
//    SUNDAY,MONDAY,TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY;

//    public static  final String SUNDAY = "Sunday";

    SUNDAY("Sunday"),MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wednesday"), THURSDAY("Thursday"),FRIDAY("Friday"),
    SATURDAY("Saturday");

   /* SUNDAY("Sunday") {
        @Override
    public String returnDay() {
        return "MONday";
    }
};*/
    /*,MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wednesday"), THURSDAY("Thursday"),FRIDAY("Friday"),
    SATURDAY("Saturday"); */
    private String day;
    Day(String day){
      this.day = day;
    }

//    DEPARTMENT("IT","Descr...."," ","  ");

    public String getDay() {
        return day;
    }

//    public abstract String returnDay();
    public static void main(String[] args) {
       /* System.out.println(Day.MONDAY.name());
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.values());*/


//        System.out.println(Day.valueOf("TUESDAY").getDay());
//        System.out.println(Day.MONDAY.toString());
//        System.out.println(Day.values())
    }
    }
