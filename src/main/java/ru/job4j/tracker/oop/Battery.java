package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(80);
        Battery second = new Battery(20);
        System.out.println("Battery load: first " + first.load + "%, second " + second.load + "%");
        second.exchange(first);
        System.out.println("Battery load: first " + first.load + "%, second " + second.load + "%");
    }
}
