package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String rideStr() {
        return null;
    }

    @Override
    public int passengersInt(int count) {
        return 0;
    }

    @Override
    public int fillUpInt(int fuel) {
        int value = 1;
        return value * fuel;
    }
}
