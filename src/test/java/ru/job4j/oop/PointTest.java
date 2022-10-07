package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void whenA200AndB300() {
        Point a = new Point(2, 0, 0);
        Point b = new Point(3, 0, 0);
        double result = a.distance3d(b);
        double expected = 1.0;
        assertThat(result).isEqualTo(expected);
    }
}