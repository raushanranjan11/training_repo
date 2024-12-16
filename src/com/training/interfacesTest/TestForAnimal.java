package com.training.interfacesTest;






        interface Bird{

            public abstract void  makeSound();

            default void  eat() {
                System.out.println("eat-----------");
            }

        }

interface   Animals {
    public static final String name = "Raj" ;
//
//    int age = 10 ;


    public abstract void  makeSound();

    default void  eat() {

    }

        /*
         * public void runExce() { // name = "Ram";
         * System.out.println("eat-----------"); }
         */
        }


class Dogs implements  Animals{// inheritance
    String breed;
//    @Override

    /*
     * @Override void makeSound() { // TODO Auto-generated method stub
     * System.out.println("woofff");
     *
     * }
     */

    public void run() {
//    	name = "Ram";
        System.out.println("eat-----------");
    }
    @Override
    public void makeSound() {
        // TODO Auto-generated method stub


        //  impl body


    }




}
/*
 * class Puppy extends Dogs{
 *
 * @Override void makeSound() { // TODO Auto-generated method stub
 * System.out.println("woofff"); }
 *
 * }
 *
 * class Cat extends Animals { String breed;
 *
 * public void makeSound() { System.out.println("meow"); } }
 */

class TestForAnimal {

    public final int age ;
    TestForAnimal(){
        this.age = 5;
    }

    public static void main(String[] args) {
        TestForAnimal t = new TestForAnimal();
//    	t.age = 10;
        Dogs dog = new Dogs();
//        Cat cat = new Cat();
        System.out.println("");
//        Puppy puppy = new Puppy();
//        puppy.

        Animals animal = new Dogs();// polymorphism
//        animal.toString();

//        Animals cat1 = new Animals();
//        new Dogs();
        animal.makeSound();//meow
//        cat.makeSound();//meow
//        Animals animals = new Animals();
//        animals.makeSound();//boooooooo


    }
}