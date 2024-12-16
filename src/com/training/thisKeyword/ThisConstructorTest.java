package com.training.thisKeyword;

class ThisConst1{

    String modal;
    ThisConstructorTest obj;
    ThisConst1(ThisConstructorTest obj){
//        this.obj=obj;
        obj.show(obj);
    }
    void display(){
//        System.out.println(obj.data);
    }
}

class ThisConstructorTest{
    int data=10;
    ThisConstructorTest(){

        ThisConst1 b=new ThisConst1(this);
        b.display();

    }
void show(ThisConstructorTest t){
        t.sum();

}
    void  sum( ){
        System.out.println( 2+3+"Sum of two number :" );
    }
    public static void main(String args[]){
        ThisConstructorTest a=new ThisConstructorTest();

//        ThisConst1 thisConst1 = new ThisConst1();
    }
}