package ru.job4j.list;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = true;
        if (!citizens.containsKey(citizens.get(citizen.getPassport()))) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = false;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return null;
    }
}
