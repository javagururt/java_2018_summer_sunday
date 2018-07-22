package com.javaguru.lesson4;

public class MaxOfThreeNumbersTeacherExample {

    int findMax(int firstNumber,
                int secondNumber,
                int thirdNumber) {
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int maxOfFirstTwoNumbers
                = maxOfTwoNumbers.findMax(firstNumber, secondNumber);
        return maxOfTwoNumbers.findMax(maxOfFirstTwoNumbers, thirdNumber);
    }

}
