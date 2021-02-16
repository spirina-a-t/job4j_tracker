package ru.job4j.tracker.inheritance;

public class HtmlReport  extends TextReport {
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + System.lineSeparator()
                + "<br/>"
                + System.lineSeparator() + "<span>" + body + "</span>";
    }
}
