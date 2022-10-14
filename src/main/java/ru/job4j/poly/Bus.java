package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("riding");
    }

    @Override
    public void passengers(int passangers) {
        System.out.println("Принял n кол-во пассажиров");
    }

    @Override
    public int refuel(int amountRefuel) {
        return 15;
    }
}
