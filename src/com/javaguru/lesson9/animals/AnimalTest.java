package com.javaguru.lesson9.animals;

import java.util.ArrayList;
import java.util.List;

class AnimalTest {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Tom"));
        animals.add(new Dog("Spike"));
        Animal abstractAnimal = new Animal("Something") {
            @Override
            void sound() {
                System.out.println("...");
            }
        };
        animals.add(abstractAnimal);

        for(Animal animal : animals) {
            animal.sound();
        }
    }
}
