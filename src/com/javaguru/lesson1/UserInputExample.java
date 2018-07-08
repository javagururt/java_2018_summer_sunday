package com.javaguru.lesson1;

import java.util.Scanner;

class UserInputExample {

    public static void main(String[] args) {
        System.out.println("Please enter first number: ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

    }
}
