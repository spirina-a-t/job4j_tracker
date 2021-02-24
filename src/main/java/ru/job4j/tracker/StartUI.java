package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemFormat = item.getCreated().format(formatter);
        System.out.println("Текущие дата и время: " + itemFormat);

        Tracker tracker = new Tracker();
        Item itemOne = new Item();
        itemOne.setName("Test item");
        tracker.add(itemOne);
        Item result = tracker.findById(1);
        System.out.println(result);

        Item itemTwo = new Item();
        itemTwo.setId(2);
        itemTwo.setName("Alonso");
        System.out.println(itemTwo);

    }
}
