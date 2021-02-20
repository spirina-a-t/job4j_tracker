package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean Code", 464);
        Book second = new Book("Agile Testing", 576);
        Book third = new Book("Hibernate", 382);
        Book four = new Book("Head First Servlets", 914);
        Book[] book = {first, second, third, four};
        for (int i = 0; i < book.length; i++) {
            Book temp = book[i];
            System.out.println(temp.getTitle() + " - " + temp.getPages());
        }
        System.out.println("Swap the first and last book:");
        Book tmp = book[0];
        book[0] = book[3];
        book[3] = tmp;
        for (int i = 0; i < book.length; i++) {
            Book temp = book[i];
            System.out.println(temp.getTitle() + " - " + temp.getPages());
        }
        System.out.println("Only books with a title \"Clean Code\":");
        for (Book temp : book) {
            if ("Clean Code".equals(temp.getTitle())) {
                System.out.println(temp.getTitle() + " - " + temp.getPages());
            }
        }
    }
}
