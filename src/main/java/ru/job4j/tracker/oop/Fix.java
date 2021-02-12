package ru.job4j.tracker.oop;

public class Fix {
    private String desc;

    public Fix(String state) {
        this.desc = state;
    }

    public static void main(String[] args) {
        Fix status = new Fix("Fix is tested.");
    }
}
