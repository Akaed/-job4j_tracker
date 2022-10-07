package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenFirst1Second2Third3Fourth4Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst1Second2Third3Then3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirst1Second2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}