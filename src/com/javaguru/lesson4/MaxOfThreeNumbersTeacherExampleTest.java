package com.javaguru.lesson4;

class MaxOfThreeNumbersTeacherExampleTest {



    public static void main(String[] args) {
        MaxOfThreeNumbersTeacherExampleTest test = new MaxOfThreeNumbersTeacherExampleTest();
        test.test1();
        test.test2();
    }

    void test1() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                10, 0, 0);
        compareResult(realResult == 10, "TEST 1");
    }

    void test2() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                0, 10, 0);
        compareResult(realResult == 10, "TEST 2");
    }

    void compareResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }


}
