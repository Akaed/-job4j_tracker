package ru.job4j.encapsulation;

public class Student {
    private String name;
    private int group;
    private String admission;

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public String getAdmission() {
        return admission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAdmission(String admission) {
        this.admission = admission;
    }
}
