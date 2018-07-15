package com.javaguru.lesson2;

import java.util.Scanner;

class SquareCalculatorConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");

        int userNumber = scanner.nextInt();

        int squareResult = userNumber * userNumber;

        System.out.println(squareResult);
    }
}
