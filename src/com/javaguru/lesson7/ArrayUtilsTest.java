package com.javaguru.lesson7;

import static com.javaguru.lesson7.ArrayUtils.*;

class ArrayUtilsTest {

    public static void main(String[] args) {
        int[] integerArray = createArray(100);
        fillArrayWithRandomNumbers(integerArray);
        printArrayToConsole(integerArray);
        System.out.println();
        int sumResult = sumArray(integerArray);
        System.out.println(sumResult);

        double averageResult = averageArray(integerArray);
        System.out.println(averageResult);
    }
}
