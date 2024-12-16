package com.training.conditioncheck.test;

public class IfCondition {
    int getAge() {

        return 3;
    }

    public static void main(String[] args) {
//        1.if
      /*  int age=5;
        if(age > 18){// boolean // experession
            System.out.print("Age is greater than 18");
        }else {
            System.out.println("Age is other than 18");
        }*/


//        2.) if-else
       /* int number=13;
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }*/

//        int marks=165;
//        checkMarks(marks);


        int age = 20;
        int weight = 80;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }


       /* int number=13;
        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);*/
    }

    static void checkMarks(int marks) {
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60)
            System.out.println("D grade");
        else if (marks >= 60 && marks < 70)
            System.out.println("C grade");
        else if (marks >= 70 && marks < 80)
            System.out.println("B grade");
        else if (marks >= 80 && marks < 90)
            System.out.println("A grade");
        else if (marks >= 90 && marks < 100)
            System.out.println("A+ grade");
        else
            System.out.println("Invalid!");

    }
}
