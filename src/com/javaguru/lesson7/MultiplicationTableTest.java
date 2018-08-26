package com.javaguru.lesson7;

class MultiplicationTableTest {

    public static void main(String[] args) {
        int[][] array = ArrayUtils.createTwoDimensionalArray(5,5);
        ArrayUtils.fillMultiplicationTable(array);
        ArrayUtils.printArrayToConsole(array);
    }
}
