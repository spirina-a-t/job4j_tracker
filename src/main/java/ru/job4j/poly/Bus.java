package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе " + count + " пассажиров.");
    }

    @Override
    public int fillUpInt(int fuel) {
        int value = 1;
        return value * fuel;
    }
}
