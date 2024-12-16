package com.training.oopsConcept.inheritance;


class Animal {

    String name;

    int age;

    public void makeSound() {
        System.out.println("boooooooo");
    }
}


class Dog extends Animal {
    String breed;
    public void makeSound() {
        System.out.println("woof");
    }
}

class Cat extends Animal {
    String breed;


    public void makeSound() {
        System.out.println("meow");
    }
}

 class TestForAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();

//        Animal animal = new Cat();//


    }
}