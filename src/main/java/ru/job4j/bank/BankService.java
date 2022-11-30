package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    public void addAccount(String passport, Account account) {
        User findPerson = findByPassport(passport);
      if (!users.containsKey(findPerson != null)) {
          users.putIfAbsent(findPerson, new ArrayList<>());
      }
    }

    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (users.get(passport) == users.get(key)) {
                return key;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        ArrayList<Account> accounts = new ArrayList<>();
        User findPerson = findByPassport(passport);
        if (findByPassport(passport) != null && users.containsKey(findByPassport(passport))) {
            for (Account request : accounts) {
                return;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
