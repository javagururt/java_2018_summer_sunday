package com.javaguru.lesson5;

class CarTest {

    public static void main(String[] args) {
        Car firstCar = new Car("blue");
        Car secondCar = firstCar;

        Car thirdCar = new Car("blue");

        if (firstCar.equals(secondCar)) {
            System.out.println("First car equals second car");
        }

        if (firstCar.equals(thirdCar)) {
            System.out.println("First car equals third car");
        } else {
            System.out.println("First car NOT equals third car");
        }

        System.out.println(firstCar);
    }
}
