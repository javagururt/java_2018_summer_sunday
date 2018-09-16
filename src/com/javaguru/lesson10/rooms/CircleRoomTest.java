package com.javaguru.lesson10.rooms;

class CircleRoomTest {

    public static void main(String[] args) {
        CircleRoomTest testCases = new CircleRoomTest();
        testCases.shouldCalculateArea();
    }

    public void shouldCalculateArea() {
        CircleRoom room = new CircleRoom("Test Room", 10);
        double expectedResult = 314;
        double actualResult = room.calculateArea();
        printResult(expectedResult == actualResult, "shouldCalculateArea");
    }

    private void printResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.err.println(testName + " FAIL");
        }
    }
}
