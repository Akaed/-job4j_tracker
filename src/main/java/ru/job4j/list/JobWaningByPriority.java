package ru.job4j.list;

import java.util.Comparator;

public class JobWaningByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getPriority() - o1.getPriority();
    }

}
