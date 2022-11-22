package ru.job4j.list;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task tusk : list) {
               numbers.add(tusk.getNumber());

        }
        return numbers;
    }
}
