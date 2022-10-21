package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit";
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Exit Program ===");
        return false;
    }
}