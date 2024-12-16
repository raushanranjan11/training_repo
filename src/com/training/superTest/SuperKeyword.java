package com.training.superTest;

public class SuperKeyword {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
//        B bClass = new B(1,2);
//        System.out.println( " Sum with super "+bClass.sum(4,5,6));
        if(true) {
            System.out.println(" Java");
            System.out.println(" Shyam");
        }
        else {
            System.out.println("Dot net");
        }




        String  name = "ShyaM";
        if (name.equals("RAM")) {
            System.out.println(" RAM");
        } else if (name.equalsIgnoreCase("Shyam")) {
            System.out.println(" Shyam");
        }
     else if(name.equalsIgnoreCase("Shyam")){
        System.out.println(" Shyam");
    }else{
        System.out.println("Rohan");
    }


    }
}

class A {
     int a = 12;

    A() {
        System.out.println(" class A with No args");
    }

    A(int a) {
        this.a = a;
        System.out.println(" class A" + this.a);

    }

    int sum(int c,int d){
        return c+d;
    }

}

class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        this.a = a;
        this.b = b;
        System.out.println(" class B");

    }

    int sum(int c,int d,int e){
        System.out.println("  variable   with Super :"+ super.a);
        return e + super.sum(c,d);
    }

}
