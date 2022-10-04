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

    public int sumAllOperation() {
        return  minus(5) + sum(5) + devide(5) + multiply(6);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.devide(5));
        System.out.println(calculator.multiply(6));
        System.out.println(minus(5));
        System.out.println(sum(5));
        System.out.println(calculator.sumAllOperation());
    }
}
