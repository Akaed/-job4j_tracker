package ru.job4j.encapsulation;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicle = new Vehicle[]{plane, train, bus};
        for (Vehicle vehicle1 : vehicle) {
              vehicle1.move();
        }
    }
}
