package com.javaguru.lesson10.rooms;

class DreamHouseTest {

    public static void main(String[] args) {
        DreamHouseTest testCases = new DreamHouseTest();
        testCases.shouldCalculateTotalArea();
    }

    public void shouldCalculateTotalArea() {
        DreamHouse dreamHouse = new DreamHouse();

        dreamHouse.addRoom(new CircleRoom("Circle Test Room", 10));
        dreamHouse.addRoom(new SquareRoom("Sq. Test Room", 20));
        dreamHouse.addRoom(new RectangleRoom("Rectangle Test Room", 5, 2));

        double expectedResult = 724;
        double actualResult = dreamHouse.calculateTotalArea();

        printResult(expectedResult == actualResult, "shouldCalculateTotalArea");
    }

    private void printResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.err.println(testName + " FAIL");
        }
    }
}
