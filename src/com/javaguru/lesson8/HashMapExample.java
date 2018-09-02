package com.javaguru.lesson8;

import java.util.HashMap;

class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> wordsAndNumbers = new HashMap<>();
        wordsAndNumbers.put("ten", 10);
        wordsAndNumbers.put("five", 5);
        wordsAndNumbers.put("one hundred", 100);

        System.out.println("Size: " + wordsAndNumbers.size());
        System.out.println("Get by key \"five\": " + wordsAndNumbers.get("five"));
        System.out.println("Remove key five: " + wordsAndNumbers.remove("five"));
        System.out.println("Contains key \"five\": " + wordsAndNumbers.containsKey("five"));
        System.out.println("Contains value 100: " + wordsAndNumbers.containsValue(100));
        System.out.println("Map: " + wordsAndNumbers);
    }
}
