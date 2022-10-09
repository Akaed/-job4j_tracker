package ru.job4j.oop;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        String ln2 = "\"";
        return "{" + ln
                + "\t\"name\" : " + ln2 + name + ln2 + "," + ln
                + "\t\"body\" : " + ln2 + body + ln2 + ln
                + "}";
    }
}
