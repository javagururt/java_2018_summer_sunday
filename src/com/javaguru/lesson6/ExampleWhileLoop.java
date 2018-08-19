package com.javaguru.lesson6;

import java.util.Scanner;

class ExampleWhileLoop {

    public static final String SECRET_KEY = "A12B";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            if (SECRET_KEY.equals(userInput)) {
                System.out.println("Success");
                break;
            }

            System.out.println("Fail");
        }
    }
}
