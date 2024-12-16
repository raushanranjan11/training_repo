package com.training.scannerTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      /* int sum = 0;
        while(scanner.hasNext()){
            sum +=scanner.nextInt();
            System.out.println("Sum "+sum);
        }*/

        System.out.println("Enter some 5 integer value for addition ");
        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i< 5 ;i++){
            integerList.add(scanner.nextInt());
        }
        long sum =  integerList.stream().mapToInt(i-> i.intValue()).sum();
        System.out.println(sum);
        scanner.close();

    }

   /* private int[] array;
    public ScannerTest1(int size){
        array = new int[size];
    }*/
}
