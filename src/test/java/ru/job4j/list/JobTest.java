package ru.job4j.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenIncreaseByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0),
                new Job("X task", 2)
        );
        jobs.sort(new JobIncreaseByName());
        List<Job> expected = Arrays.asList(
                new Job("X task", 2),
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenIncreaseByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Fix bug", 2)
        );
        jobs.sort(new JobIncreaseByPriority());
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Fix bug", 2)
        );
        jobs.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0),
                new Job("Fix bug", 2)
        );
        jobs.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 2),
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparingIncreaseByNameAndDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new JobIncreaseByName().thenComparing(new JobDescByPriority()));
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 1)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparingDescByPriorityAndIncreaseByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 5),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByPriority().thenComparing(new JobIncreaseByName()));
        List<Job> expected = Arrays.asList(
                new Job("X task", 5),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }
}