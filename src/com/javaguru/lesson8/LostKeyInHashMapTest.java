package com.javaguru.lesson8;

import java.util.HashMap;

class LostKeyInHashMapTest {

    public static void main(String[] args) {
        HashMap<User, String> usersAndGreetings = new HashMap<>();
        User firstUser = new User("Ruslan", 25);
        usersAndGreetings.put(firstUser, "HELLO");
        usersAndGreetings.put(new User("Dmitrij", 20), "HELLO WORLD");
        usersAndGreetings.put(new User("Alex", 30), "YO");

        System.out.println("Map: " + usersAndGreetings);

        User secondUser = new User("Ruslan", 25);

        System.out.println("Equals: " + firstUser.equals(secondUser));
        String ruslanGreeting = usersAndGreetings.get(secondUser);
        System.out.println("Greeting : " + ruslanGreeting);
    }
}
