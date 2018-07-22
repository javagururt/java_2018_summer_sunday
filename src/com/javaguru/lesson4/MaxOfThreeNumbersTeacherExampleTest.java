package com.javaguru.lesson4;

class MaxOfThreeNumbersTeacherExampleTest {



    public static void main(String[] args) {
        MaxOfThreeNumbersTeacherExampleTest test = new MaxOfThreeNumbersTeacherExampleTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
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

    void test3() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                0, 0, 10);
        compareResult(realResult == 10, "TEST 3");
    }

    void test4() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                10, 10, 10);
        compareResult(realResult == 10, "TEST 4");
    }

    void test5() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                10, 10, 0);
        compareResult(realResult == 10, "TEST 4");
    }

    void test6() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                10, 0, 10);
        compareResult(realResult == 10, "TEST 6");
    }

    void test7() {
        MaxOfThreeNumbersTeacherExample maxOfThreeNumbers = new MaxOfThreeNumbersTeacherExample();
        int realResult = maxOfThreeNumbers.findMax(
                0, 10, 10);
        compareResult(realResult == 10, "TEST 7");
    }

    void compareResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }


}
