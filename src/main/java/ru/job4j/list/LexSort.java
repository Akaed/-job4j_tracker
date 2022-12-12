package ru.job4j.list;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort  implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] words = left.split("\\.");
        String[] words2 = right.split("\\.");
        return Integer.compare(Integer.parseInt(words[0]), Integer.parseInt(words2[0]));
    }
}
