package com.training.scannerTest;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User name .");
        String userName = scanner.nextLine();
        System.out.println("Name is: " + userName);

        System.out.println("Enter Roll No.");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter Roll No." + rollNumber);

        scanner.close();

    }
}
