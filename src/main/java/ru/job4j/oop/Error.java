package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    Error() {
    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error = new Error(true, 10, "got it");
        error.printInfo();
    }
}
