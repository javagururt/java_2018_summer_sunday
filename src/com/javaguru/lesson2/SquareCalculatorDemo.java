package com.javaguru.lesson2;

import java.util.Scanner;

class SquareCalculatorDemo {

    public static void main(String[] args) {
        int userNumber = getNumberFromUser();

        SquareCalculator squareCalculator = new SquareCalculator();
        int result = squareCalculator.calculateSquare(userNumber);

        System.out.println(result);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");

        int userNumber = scanner.nextInt();

        return userNumber;
    }
}
