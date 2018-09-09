package com.javaguru.lesson9.animals;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Woof!");
    }
}
