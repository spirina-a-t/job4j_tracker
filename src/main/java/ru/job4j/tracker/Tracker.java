package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemWithoutNull = new Item[items.length];
        for (Item item : items) {
            if (item != null) {
                itemWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[items.length];
        for (Item item : items) {
            if (item.getName().equals(key)) {
                names[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(names, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        items[index].setName(item.getName());
        return findById(index) != null;
    }
}