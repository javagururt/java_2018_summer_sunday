package com.javaguru.lesson7;

import java.util.Random;

class FillArrayWithRandomNumbersTest {

    public static void main(String[] args) {
        int[] integerArray = new int[10];

        Random randomGenerator = new Random();
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = randomGenerator.nextInt(101);
        }

//        for (int i = 0; i < integerArray.length; i++) {
//            int element = integerArray[i];
//            System.out.println(element);
//        }

        for (int element : integerArray) {
            System.out.println(element);
        }
    }
}
