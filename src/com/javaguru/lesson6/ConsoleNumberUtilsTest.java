package com.javaguru.lesson6;

class ConsoleNumberUtilsTest {

    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        ConsoleNumberUtils.printRange(a, b);

        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        ConsoleNumberUtils.printOddNumbersInRange(a, b);

        System.out.println();

        ConsoleNumberUtils.printSumInRange(1, 5);

        System.out.println();

        ConsoleNumberUtils.printMultiplicationTable(1, 5);
    }

}
