package com.training.ioPackage;

import java.util.ArrayList;
import java.util.List;

class CheckedExceptionClass {
    public static void main(String []args){

// String []student = new String[2];
// student[0]= "Raj";
//// student[1] = 2;
// List<Integer> list = new ArrayList();
// list.add(2);
//
// for (Object o :list) {
// System.out.println(Integer.valueOf(o.toString()) / 2);
// }


        List<Student> listOfStudent = new ArrayList();
        listOfStudent.add(new Student("Raj", 2, "Third",
                7, new StudentAddress("abc", "cde",
                "efg", "ert", 10000L)));
        listOfStudent.add(new Student(null, 2, "Third",
                7, new StudentAddress("abc", "cde",
                "efg", "ert", 10000L)));


        for (Student student :listOfStudent) {
            System.out.println(student);
            try {
                if (student.getName() == null) {
                    throw new StudentException("Student named as NULL");
                }
                System.out.println(student.getName().toUpperCase());
            } catch (NullPointerException stExc) {
                System.out.println(stExc.getMessage());
            }
            catch (StudentException stExc) {
                System.out.println(stExc.getMessage());
            }
        }
    }
}


class Student {
    private String name;
    private int rollNumber;
    private String batch;
    private int marks;
    private StudentAddress studentAddress;

    public Student(String name, int marks, String batch, int rollNumber,StudentAddress studentAddress ) {
        this.name = name;
        this.studentAddress = studentAddress;
        this.marks = marks;
        this.batch = batch;
        this.rollNumber = rollNumber;
    }

    public Student(String name, int rollNumber, String batch, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.batch = batch;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", batch='" + batch + '\'' +
                ", marks=" + marks +
                ", studentAddress=" + studentAddress +
                '}';
    }
}


class Address {

    private String village;
    private String postOffice;
    private String policeStation;
    private String district;

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public Address(String village, String postOffice, String policeStation, String district) {
        this.village = village;
        this.postOffice = postOffice;
        this.policeStation = policeStation;
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "village='" + village + '\'' +
                ", postOffice='" + postOffice + '\'' +
                ", policeStation='" + policeStation + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}

// AccountHolder(User) -> Addrees,mobileNumber,AccountNumber
//class Addrees;
////mobileNumber[]
//List<Long> mobileNumber;
//List<Long> AccountNumber;



//
class StudentAddress extends Address{

    private Long pinCode ;

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public StudentAddress(String village, String postOffice, String policeStation, String district,Long pinCode) {
        super(village,postOffice,policeStation,district);
        this.pinCode = pinCode;
    }
}

class StudentException extends Exception{
    public StudentException(String msg) {
        super(msg);
    }
}

