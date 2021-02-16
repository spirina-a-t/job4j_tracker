package ru.job4j.tracker.oop;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Item first = new Item();
        Item second =  new Item(35);
        Item third = new Item("Kate");
        Item four = new Item(1, "Joye");
    }
}
