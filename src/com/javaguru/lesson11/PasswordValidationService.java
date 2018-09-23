package com.javaguru.lesson11;

class PasswordValidationService {

    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int MAX_PASSWORD_LENGTH = 15;

    public void validate(String password) {
        checkPasswordNotNull(password);
        checkPasswordMinLength(password);
        checkPasswordMaxLength(password);
    }

    private void checkPasswordNotNull(String password) {
        if (password == null) {
            throw new ValidationException("Password must be not null");
        }
    }

    private void checkPasswordMinLength(String password) {
        if (password.length() <= MIN_PASSWORD_LENGTH) {
            throw new ValidationException("Password length must be more than 8");
        }
    }

    private void checkPasswordMaxLength(String password) {
        if (password.length() > MAX_PASSWORD_LENGTH) {
            throw new ValidationException("Password length must be less than 16");
        }
    }
}
