package com.javaguru.lesson8;

import java.util.HashSet;

class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("RED");
        colors.add("BLUE");
        colors.add("BLUE");
        colors.add("PINK");
        colors.add("PINK");
        colors.add("BLACK");
        colors.add("RED");
        colors.add("BLACK");

        System.out.println("Size: " + colors.size());
        System.out.println("Set: " + colors);
        System.out.println("Remove PINK: " + colors.remove("PINK"));
        System.out.println("Set: " + colors);
        System.out.println("Contains RED: " + colors.contains("RED"));
    }
}
