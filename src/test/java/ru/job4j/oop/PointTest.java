package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void whenA00AndB02() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenA20AndB70() {
        Point a = new Point(2, 0);
        Point b = new Point(7, 0);
        double result = a.distance(b);
        double expected = 5.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenA20AndB20() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 0.0;
        assertThat(result).isEqualTo(expected);
    }

}