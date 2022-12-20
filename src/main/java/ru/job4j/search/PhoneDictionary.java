package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }
    
    public ArrayList<Person> find(String key) {
        Predicate<Person> compareName = p -> p.getName().contains(key);
        Predicate<Person> comparePhone = p -> p.getPhone().contains(key);
        Predicate<Person> compareAddress = p -> p.getAddress().contains(key);
        Predicate<Person> compareSurname = p -> p.getSurname().contains(key);
        Predicate<Person> compareAll = compareName.or(comparePhone).or(compareAddress).or(compareSurname);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (compareAll.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
