package com.training.program;

public class MaximumInThreeNumber {

    public static void main(String[] args) {
        System.out.println(MaximumInThreeNumber.maxNumberUseTernary(341,711,551));
//        MaximumInThreeNumber.maxNumber(11,117,55);
    }

    public static void maxNumber(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {

            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }


    }

    public static int maxNumberUseTernary(int x, int y, int z) {
        return x > y ? (x > z ? x : z) : (y > z ? y : (z > x ? z : x));  // condtional ? true:false
    }
}
