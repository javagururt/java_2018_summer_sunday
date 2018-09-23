package com.javaguru.lesson11;

import java.util.Random;

class ExceptionExample {

    public static void main(String[] args) {
        try {
            throwRuntimeException();
            throwException();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }
    }

    private static void throwException() throws Exception {
        throw new Exception("Checked exception");
    }

    private static void throwRuntimeException() {
        Random random = new Random();
        int number = random.nextInt(2);
        if (number == 0) {
            throw new RuntimeException("Unchecked exception");
        }
    }
}
