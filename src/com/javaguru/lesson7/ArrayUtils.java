package com.javaguru.lesson7;

import java.util.Random;

public class ArrayUtils {

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public static void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
