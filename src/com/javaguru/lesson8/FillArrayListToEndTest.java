package com.javaguru.lesson8;

import java.util.ArrayList;
import java.util.List;

class FillArrayListToEndTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();

        long result = finish - start;

        System.out.println("Result: " + result + " ms");
    }
}
