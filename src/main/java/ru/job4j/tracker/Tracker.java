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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                names[count] = item;
                count++;
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
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index].setId(id);
            items[index].setName(item.getName());
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int start = indexOf(id);
        if (start != -1) {
            items[start] = null;
            System.arraycopy(items, start + 1, items, start, size - start - 1);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}