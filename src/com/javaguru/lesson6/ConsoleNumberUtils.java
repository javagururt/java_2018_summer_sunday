package com.javaguru.lesson6;

class ConsoleNumberUtils {

    public static void printRange(int from, int to) {
        while (from <= to) {
            System.out.println(from);
            from++;
        }
    }

    public static void printOddNumbersInRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printSumInRange(int from, int to) {
        int sum = 0;

        while (from <= to) {
            sum += from;
            from++;
        }
        System.out.println(sum);
    }

    public static void printMultiplicationTable(int from, int to) {
        for (int i = from; i <= to; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(i + "x" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
