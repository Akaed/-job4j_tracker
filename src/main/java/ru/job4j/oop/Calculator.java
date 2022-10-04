package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int devide(int c) {
     return c / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int b) {
        return x + b;
    }

    public int sumAllOperation(int z) {
        return z + minus(5) + sum(5) + devide(5) + multiply(6);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.devide(5));
        System.out.println(calculator.multiply(6));
        System.out.println(minus(5));
        System.out.println(sum(5));
        System.out.println(calculator.sumAllOperation(5));
    }
}
