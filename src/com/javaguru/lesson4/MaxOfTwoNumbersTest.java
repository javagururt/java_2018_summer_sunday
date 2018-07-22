package com.javaguru.lesson4;

class MaxOfTwoNumbersTest {

    public static void main(String[] args) {
        MaxOfTwoNumbersTest test = new MaxOfTwoNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }

    void test1() {
        // Prepare test data
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = 2;

        // Invoke production code
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int realResult = maxOfTwoNumbers.findMax(firstNumber, secondNumber);

        // Compare results
        if (realResult == expectedResult) {
            System.out.println("TEST 1 OK");
        } else {
            System.out.println("TEST 1 FAIL");
        }
    }

    void test2() {
        // Prepare test data
        int firstNumber = 2;
        int secondNumber = 1;
        int expectedResult = 2;

        // Invoke production code
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int realResult = maxOfTwoNumbers.findMax(firstNumber, secondNumber);

        // Compare results
        if (realResult == expectedResult) {
            System.out.println("TEST 2 OK");
        } else {
            System.out.println("TEST 2 FAIL");
        }
    }

    void test3() {
        // Prepare test data
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 2;

        // Invoke production code
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int realResult = maxOfTwoNumbers.findMax(firstNumber, secondNumber);

        // Compare results
        if (realResult == expectedResult) {
            System.out.println("TEST 3 OK");
        } else {
            System.out.println("TEST 3 FAIL");
        }
    }

}
