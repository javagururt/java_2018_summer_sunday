package com.javaguru.lesson11;

class PasswordValidationServiceTest {

    public static void main(String[] args) {
        PasswordValidationServiceTest testCases = new PasswordValidationServiceTest();
        testCases.shouldThrowValidationExceptionPasswordNull();
        testCases.shouldThrowExceptionMinLength();
        testCases.shouldThrowExceptionMaxLength();
        testCases.shouldValidatePasswordSuccess();
    }

    public void shouldThrowValidationExceptionPasswordNull() {
        PasswordValidationService service = new PasswordValidationService();
        String expectedMessage = "Password must be not null";
        String actualMessage = "";
        try {
            service.validate(null);
        } catch (ValidationException e) {
            actualMessage = e.getMessage();
        } finally {
            printResult(expectedMessage.equals(actualMessage), "shouldThrowValidationExceptionPasswordNull");
        }
    }

    public void shouldThrowExceptionMinLength() {
        PasswordValidationService service = new PasswordValidationService();
        String expectedMessage = "Password length must be more than 8";
        String actualMessage = "";
        try {
            service.validate("213");
        } catch (ValidationException e) {
            actualMessage = e.getMessage();
        } finally {
            printResult(expectedMessage.equals(actualMessage), "shouldThrowExceptionMinLength");
        }
    }

    public void shouldThrowExceptionMaxLength() {
        PasswordValidationService service = new PasswordValidationService();
        String expectedMessage = "Password length must be less than 16";
        String actualMessage = "";
        try {
            service.validate("12345678901234567890");
        } catch (ValidationException e) {
            actualMessage = e.getMessage();
        } finally {
            printResult(expectedMessage.equals(actualMessage), "shouldThrowExceptionMaxLength");
        }
    }

    public void shouldValidatePasswordSuccess() {
        PasswordValidationService service = new PasswordValidationService();
        service.validate("1234556789");
        printResult(true, "shouldValidatePasswordSuccess");
    }

    private void printResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " :OK");
        } else {
            System.out.println(testName + " :FAIL");
        }
    }
}
