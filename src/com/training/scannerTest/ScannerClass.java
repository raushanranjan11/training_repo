package com.training.scannerTest;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Enter Name");

        String userName = scanner.nextLine();
        System.out.println("Name is: " + userName);

        System.out.println("Enter Roll No.");
        int rollNumber = scanner.nextInt();
        System.out.println("Roll No." + rollNumber);*/
        System.out.println("Enter No." );
//        System.out.println("Gender." + scanner.nextLine());
        System.out.println("Entered No. is "+scanner.nextInt() );
        int sum =0;
        while (scanner.hasNext()){
            sum+=scanner.nextInt();
        }
        System.out.println(sum);
       /* char [] input  = inputNumber.toCharArray();
        for (char c:input) {
            Integer.parseInt(c).

        }*/
    }

    }
