package com.javaguru.lesson8;

import java.util.ArrayList;

class FillArrayListToStartTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(0, i);
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result " + result + " ms");
    }
}
