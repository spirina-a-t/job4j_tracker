package ru.job4j.tracker;

import java.util.Scanner;

import static java.lang.System.lineSeparator;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] all = tracker.findAll();
                for (Item temp : all) {
                    System.out.println(temp);
                }
                if (all.length == 0) {
                    System.out.println("Заявок не обнаружено");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter id Item: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.findById(id) != null) {
                    System.out.println("Enter new name: ");
                    String name = scanner.nextLine();
                    Item newItem = new Item();
                    newItem.setName(name);
                    boolean rsl = tracker.replace(id, newItem);
                    if (rsl) {
                        System.out.println("Имя заявки успешно изменено: " + newItem);
                    }
                } else {
                    System.out.println("Заявка с id " + id + " не найдена");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Enter id Item: ");
                int id = Integer.valueOf(scanner.nextLine());
                boolean deleted = tracker.delete(id);
                if (deleted) {
                    System.out.println("Заявка успешно удалена");
                } else {
                    System.out.println("Заявка с id " + id + " не найдена");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter id Item: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item itemFind = tracker.findById(id);
                boolean rsl = itemFind != null;
                if (rsl) {
                    System.out.println(itemFind);
                } else {
                    System.out.println("Заявка с id " + id + " не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter name Item: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                boolean res = item != null;
                if (res) {
                    for (Item temp : item) {
                        System.out.println("Найдена заявка " + temp);
                    }
                } else {
                    System.out.println("Заявка с именем " + name + " не найдена");
                }
            } else if (select == 6) {
            run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu." +  lineSeparator()
                + "0. Add new Item" + lineSeparator()
                + "1. Show all items" + lineSeparator()
                + "2. Edit item" + lineSeparator()
                + "3. Delete item" + lineSeparator()
                + "4. Find item by Id" + lineSeparator()
                + "5. Find items by name" + lineSeparator()
                + "6. Exit Program" + lineSeparator());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
