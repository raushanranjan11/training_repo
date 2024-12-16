package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Rohan",100));
        list.add(new Employee(2,"Rohan",300));
        list.add(new Employee(1,"Rohan",500));

//        list.stream().sorted((emp1,emp2) -> emp1.getAge() - emp2.getAge() > 0).collect(Collectors.toList());

    }
}

class Employee  {
    public Employee(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    private int empId;
    private String  name;
    private int age;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
