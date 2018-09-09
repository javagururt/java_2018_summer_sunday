package com.javaguru.lesson9.animals;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Meow!");
    }
}
