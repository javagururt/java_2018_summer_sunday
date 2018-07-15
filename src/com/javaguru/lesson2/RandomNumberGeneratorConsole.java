package com.javaguru.lesson2;

import java.util.Random;

class RandomNumberGeneratorConsole {

    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int firstNumber = randomGenerator.nextInt(101);
        int secondNumber = randomGenerator.nextInt(101);
        int thirdNumber = randomGenerator.nextInt(101);

        int sumResult = firstNumber + secondNumber + thirdNumber;

        System.out.println(sumResult);
    }
}
