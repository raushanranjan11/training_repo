package com.training.thisKeyword;



class Student{

    int rollno;
    String name;
    float fee;
    Employee emp;

    Student(Employee emp){
        this.emp = emp;
    }


    Student(int rollno1,String name,float fee){
        rollno=rollno;
         name=name;
        fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}

    public void Student(){
        System.out.println("Student method");
    }
}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
class TestThisKey{

    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
//        s2.display();
//        s2.Student();

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        TestThisKey testThis = new TestThisKey();
//        testThis.method1();
//++++++++++++++++++++++++++++++++++++++++++++
//        testThis.method2();

        Employee employee= new Employee("Ram",2,"third");

    }

    public void method1(){

        System.out.println("method1 called");
//        method2();
    }
    public void method2(){
        System.out.println("method2 called");
        methodforObject(this);
    }


    public void methodforObject(TestThisKey obj){
        System.out.println(obj);
        obj.method1();
        System.out.println("methodforObject called");
    }

    /*TestThisKey(){
        Employee emp5 = new Employee(this);
        emp5.getDetails();
    }*/
}



//1.) refer current class instance variable.
//2.)invoke current class method (implicitly)

//3.)this() can be used to invoke current class constructor.

// 4.) can be passed as an argument in the method call.
//6.)this can be used to return the current class instance from the method.


//  5.)      this can be passed as argument in the constructor call.///                 ---

class  Employee  {
    private  String name  ;
    private   int roll  ;
    private String second;

    /*TestThisKey obj;
    Employee(TestThisKey obj){
        this.obj=obj;
    }*/



    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public Employee(){
//        this();
        System.out.println("no args constructor called");
    }

    public Employee(String name){
        this();
        this.name = name;
        System.out.println("one args constructor called");


    }


    public Employee(String name, int roll) {
        this(name);
        this.name = name;
        this.roll = roll;
        System.out.println("two args constructor called");
    }

    public Employee( String name,int roll, String second) {
        this(name,roll);
        this.roll = roll;
        this.name = name;
        this.second = second;
        System.out.println("three args constructor called");
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public   String getDetails() {
        return "Employee{ subclass" +
                name + " ," + roll +
                '}';
    }


    /* @Override
    public String toString() {
        return "Employee{" +
                 name + " ," + roll +
                '}';
    }*/
    Employee getEmployee(){
        return this;
    }

}

class  Company{


    public  String getDetails(){

        return "Employeedetails { parent "  +

                '}';
    }
}