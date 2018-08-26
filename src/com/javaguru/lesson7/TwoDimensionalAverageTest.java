package com.javaguru.lesson7;

class TwoDimensionalAverageTest {

    public static void main(String[] args) {
        int[][] array = ArrayUtils.createTwoDimensionalArray(2,5);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArrayToConsole(array);
        System.out.println();

        int sumResult = ArrayUtils.sumArray(array);
        System.out.println(sumResult);
        double averageResult = ArrayUtils.averageArray(array);
        System.out.println(averageResult);
    }
}
