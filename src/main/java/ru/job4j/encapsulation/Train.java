package ru.job4j.encapsulation;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("I am very cool train");
    }
}
