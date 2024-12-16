package com.training.program;

public class OddEvenNumber {

    public static void main(String[] args) {
//        System.out.println(findOddEven(150));

        System.out.println(factorial(5));

    }

    public static boolean findOddEven(int a) {
        return a % 2 == 0 ? true : false;
    }

    // Method to find factorial of the given number
    static int factorial(int n)// 3! = 3,2,1
    {
        int res = 1, i;
        for (i = 2; i <= n; i++) {
            res =res * i;
        }
        return res;
    }

    static int factorialRecur(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorialRecur(n-1));
    }
}
