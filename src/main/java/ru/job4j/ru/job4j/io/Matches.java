package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches > 0 && matches <= 3) {
                if (count - matches >= 0) {
                    count = count - matches;
                } else {
                    System.out.println("На столе меньше " + matches
                            + " спичек, попробуйте еще раз");
                    turn = !turn;
                }
                System.out.println("Осталось " + count + " спичек");
            } else if (matches < 1) {
                System.out.println("Вы не взяли ни одной спички, попробуйте еще раз");
                System.out.println("Осталось " + count + " спичек");
                turn = !turn;
            } else if (matches > 3) {
                System.out.println("Вы не можете взять больше трех спичек, попробуйте еще раз");
                System.out.println("Осталось " + count + " спичек");
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}