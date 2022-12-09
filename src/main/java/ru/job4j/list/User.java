package ru.job4j.list;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        int k;
        if (name.equals(o.getName())) {
            k = Integer.compare(age, o.getAge());
        } else {
            k = Integer.compare(age, o.getAge());
        }
            return k;
    }

    @Override
    public String toString() {
        return "User{"
                +
                "name='" + name + '\''
                +
                ", age=" + age
                +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&  Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
