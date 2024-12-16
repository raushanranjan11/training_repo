package com.training.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayClass {


    public static void main(String[] args) {

        int a[];
        int[] a1;
        int [] a2;

//        int [] a4 = new int[];

        int aa[] = new int[6];// array
        aa[0] = 6;
        int bb[] = {2}; // declaration- instatiation-initialization[2,0,1,3] [2]

//        System.out.println(bb[0]);


//        int cc[] = new int[5];
//        int d = 5;
//        for (int i = 0; i< cc.length ;i++){
//            d = d +1;
//            System.out.println(cc[i] = d);
//        }
//        System.out.println(cc);
//        Arrays.stream(cc).forEach((x)-> System.out.print(x));




        int integerArray [] = {2,3,4,5,6,7,8,9};

       /* for (int i = 0; i< integerArray.length;i++){
            System.out.println(integerArray[i]);
        }*/
       /* System.out.println("3rd index :"+integerArray[3]);
         for (int i : integerArray) {
            System.out.println("For each approach  : " + i);
        }*/

      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
//        Arrays.stream(integerArray).forEach((x)-> System.out.println(x));
        Arrays.stream(integerArray).forEach(System.out::println);

//        System.out.println(integerArray.getClass().getName());

        String []name = {"Ram","Sujay","Abhishek","vikas"};
        long []longArray = {123l,2345l,654l};
        char []charArray = {'s','h'};
        for (long c:longArray) {
            System.out.println(c);
        }
        Employee emp = new Employee();
        emp.setName("Rohan");
        emp.setSalary("100");
        Employee emp1 = new Employee();
        emp1.setName("Sohan");
        emp1.setSalary("500");
        Employee []employees = new Employee[2];
        employees[0] =  emp;employees[1] =  emp1;
        System.out.println("**************************************");
        System.out.println(employees);
        for (Employee e: employees) {
            System.out.println(e);
        }
        System.out.println(employees.getClass().getName());
    }
}

class Employee{

    String name;
    String salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
