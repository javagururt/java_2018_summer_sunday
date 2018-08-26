package com.javaguru.lesson7;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        int[][] array = ArrayUtils.createTwoDimensionalArray(3,5);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArrayToConsole(array);
    }
}
