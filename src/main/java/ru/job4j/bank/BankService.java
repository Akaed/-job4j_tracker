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
        ArrayList<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public boolean deleteUser(String passport) {
        users.remove(passport);
        return true;
    }

    public void addAccount(String passport, Account account) {
        ArrayList<Account> accounts = new ArrayList<>();
      if (!users.containsKey(findByPassport(passport))) {
          users.put(findByPassport(passport), accounts);
      }
    }

    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            List<Account> value = users.get(key);
        }
        if (users.isEmpty()) {
            return null;
        }
       // return ;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null && users.containsKey(findByPassport(passport)) {

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
