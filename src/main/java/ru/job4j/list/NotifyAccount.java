package ru.job4j.list;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account list : accounts) {
                rsl.add(list);
        }
        return rsl;
    }
}
