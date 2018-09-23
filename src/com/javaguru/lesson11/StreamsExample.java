package com.javaguru.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class StreamsExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("a");
        strings.add("B");
        strings.add("D");
        strings.add("F");
        strings.add("F");
        strings.add("C");
        strings.add("c");
        strings.add("w");
        strings.add("A");


        strings.stream()
                .map(s -> s.toLowerCase())
                .sorted()
                .forEach(s -> System.out.println(s));

        Set<String> uqString = strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(uqString);

        Optional<String> optionalString = strings.stream()
                .filter(s -> s.equalsIgnoreCase("z"))
                .findFirst();

        String anotherResult = optionalString
                .orElse("O");
        System.out.println("Another result: " + anotherResult);

        String result = optionalString
                .orElseThrow(() -> new RuntimeException("Z not found"));
        System.out.println(result);
    }
}
