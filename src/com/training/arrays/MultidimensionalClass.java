package com.training.arrays;

import java.util.Arrays;

public class MultidimensionalClass {

    public static void main(String[] args) {

        int a[][];
        int[][] a1;
        int [][]a2;
        int []a3[];

        int bb[][]  = new int[3][3];
        bb[0][0] = 5;
        bb[0][1] = 6;
        bb[0][2] = 7;

        bb[1][0] = 8;
        bb[1][1] = 9;
        bb[1][2] = 10;

//        System.out.println(bb.getClass().getName());

        /*for (int i = 0; i< 3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+bb[i][j] + " ");
            }
            System.out.println();
        }*/
        /**
        +------------+
          5 6 7                     {5,6,7[},{8,9,10},{0,0,0}]
          8 9 10
          0 0 0
        +------------+

        */
//       System.out.println(Arrays.deepToString(bb));
        for (int[] arr2 : bb) {
//            System.out.println(Arrays.toString(arr2));
            Arrays.stream(arr2).forEach((x)-> System.out.println(x));
            for (int val : arr2)
                System.out.print(val );  // 5,6,7
                                        // 8,910
            System.out.println();
        }

    }

}
