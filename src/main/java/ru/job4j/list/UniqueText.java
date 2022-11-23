package ru.job4j.list;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String first : origin) {
                  check.add(first);
        }
        for (String second : text) {
            if (!check.contains(second)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
