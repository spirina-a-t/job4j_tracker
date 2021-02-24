package ru.job4j.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.lineSeparator;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?" + lineSeparator()
                + "Задай вопрос, на который я могу ответить \"Да\" или \"Нет\".");
        String ask = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да!");
        } else if (answer == 1) {
            System.out.println("Нет!");
        } else {
            System.out.println("Может быть.");
        }
    }
}
