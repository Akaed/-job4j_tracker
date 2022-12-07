package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ItemDescByNameTest {
    @Test
    public void whenDescending() {
        List<Item> jobs = Arrays.asList(
                new Item(1, "q"),
                new Item(2, "qq"),
                new Item(3, "qqq")
        );
        jobs.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "qqq"),
                new Item(2, "qq"),
                new Item(1, "q")
        );
        assertThat(jobs).isEqualTo(expected);
    }

}