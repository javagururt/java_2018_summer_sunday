package com.javaguru.lesson2;

class HumanDemo {

    public static void main(String[] args) {
        String name = "Vasya";
        int age = 20;

        Human firstHuman = new Human(name, age);
        Human secondHuman = new Human("Dima", 30);

        firstHuman.sayHello();
        secondHuman.sayHello();
    }
}
