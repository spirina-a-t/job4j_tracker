package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String result = "Неизвествное слово. ";
        return result + eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        System.out.println(word.engToRus("How"));
    }
}
