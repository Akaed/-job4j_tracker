package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int devide(int z) {
     return z / x;
    }

    public int multiply(int z) {
        return x * z;
    }

    public static int minus(int z) {
        return z - x;
    }

    public static int sum(int z) {
        return x + z;
    }

    public int sumAllOperation(int z) {
        return minus(z) + sum(z) + devide(z) + multiply(z);
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
