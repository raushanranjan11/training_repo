package com.training.oopsConcept.inherit;


class Animals {

    String name;

    int age;

    public void makeSound() {
        System.out.println("boooooooo");
    }
}


class Dogs extends Animals {
    String breed;
    public void makeSound() {
        System.out.println("woof");
    }
}

class Cat extends Animals {
    String breed;


    public void makeSound() {
        System.out.println("meow");
    }
}

class TestForAnimal {
    public static void main(String[] args) {

//        Dog dog = new Dog();

//        Animal animal = new Cat();//
        new Dogs();


    }
}