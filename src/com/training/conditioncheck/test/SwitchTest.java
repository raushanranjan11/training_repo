package com.training.conditioncheck.test;

public class SwitchTest {

    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int number = 20;
        //Switch expression
        switch (number) {// String /enum
            //Case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            //Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
        }

      /* int number=20;//Switch Statement is fall-through
        switch(number){
            //switch cases without break statements
            case 10: System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }*/


        String levelString = "Expert";
        int level = 0;
        switch (levelString) {// java 7  primitive/wrapper -- int- Integer, enum
            //Using String Literal in Switch case
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level = 0;
                break;
        }
        System.out.println("Your Level is: " + level);





       /* LevelString[] levelString = LevelString.values();
        int level = 0;
        for (LevelString l : levelString) {
            switch (l) {// java 7  primitive/wrapper -- int- Integer, enum  //Using String Literal in Switch case
                case "Beginner":
                    level = 1;
                    break;
                case Intermediate:
                    level = 2;
                    break;
                case Expert:
                    level = 3;
                    break;
                default:
                    level = 0;
                    break;
            }
        }*/

        /*LevelString[] levelString1 = LevelString.values();
        for (int i = 0; i< levelString1.length ; i++){
            if(levelString1[i].equals("Beginner")){

            }
            if(levelString1[i].equals("Intermediate")){

            }
            if(levelString1[i].equals("Expert")){

            }else{

            }
        }*/
    }
}


 enum LevelString{Beginner,Intermediate,Expert}