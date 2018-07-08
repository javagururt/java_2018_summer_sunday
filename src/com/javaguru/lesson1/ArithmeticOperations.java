package com.javaguru.lesson1;

import java.util.Scanner;

class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Please enter number: ");
        int secondNumber = sc.nextInt();
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum: " + sumResult);

        int subtractResult = firstNumber - secondNumber;
        System.out.println("Subtract: " + subtractResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply: " + multiplyResult);

        double divideResult = firstNumber / (double) secondNumber;
        System.out.println("Divide: " + divideResult);

    }
}
