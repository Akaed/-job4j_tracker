package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация методов проекта банковский аккаунт
 * @author Akaed
 *  @version 1.0
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод должен добавить пользователя в систему
     * @param user пользователь которого добавляют
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     *  Это метод, который позволит удалить пользователя из системы.
     * @param passport паспорт который удаляют
     * @return возвращаем значение указанного метода
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод должен добавить новый счет к пользователю
     * через findByPassport ищем пользователя по паспорту
     * получаем список счетов пользователя
     * проверяем что такого счета еще нет и добавляем
     * @param passport по паспорту ищем счет
     * @param account  по счету смотрим уникальность
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * внутри проверка что паспорт у key равен тому паспорту, который мы передали в качестве параметра
     * @param passport сравнение паспортов по параметру
     * @return внутри проверки вернем key, а если ничего не нашли - вернули null
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * нашли пользователя и проверили на null
     * извлекли список аккаунтов
     *
     * @param passport находим паспорт по параметру
     * @param requisite находим реквизиты по параметру
     * @return если у аккаунта совпали реквизиты - вернули найденный объект
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод  перечисляет деньги с одного счёта на другой счёт
     * @param srcPassport паспорт пользователя, с счета которого происходит первод средств
     * @param srcRequisite реквизит счета, с которого происходит первод средств
     * @param destPassport паспорт пользователя, на счет которого происходит первод средств
     * @param destRequisite реквизит счета, на который происходит первод средств
     * @param amount количество средств списания и зачисления
     * @return внутри переназначили балансы обоих аккаунтов, вернули true
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && (srcAccount.getBalance() - amount) >= 0) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
