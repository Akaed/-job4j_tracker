package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] arrayPassword = password.toCharArray();
        boolean result = true;
        for (char x : arrayPassword) {
            if (Character.isUpperCase(x)) {
                result = false;
                break;
            }
        }
        if (result) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        result = true;
        for (char x : arrayPassword) {
            if (Character.isLowerCase(x)) {
                result = false;
                break;
            }
        }
        if (result) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        result = true;
        for (char x : arrayPassword) {
            if (Character.isDigit(x)) {
                result = false;
                break;
            }
        }
        if (result) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        result = true;
        for (char x : arrayPassword) {
            if (!Character.isDigit(x) && !Character.isAlphabetic(x)) {
                result = false;
                break;
            }
        }
        if (result) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] specsymbol = new String[] {"qwerty", "12345", "password", "admin", "user"};
        for (String space: specsymbol) {
            if (password.toLowerCase().contains(space)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
