package com.javaguru.lesson2;

class Human {

    String name;
    int age;

    public Human(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    void sayHello() {
        System.out.println("Hello! My name is "
                + name + ". I'm "
                + age + " years old.");
    }
}
