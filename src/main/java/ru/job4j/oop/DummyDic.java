package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String letter = "Неизвестное слово." + eng;
        return letter;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("noNmae"));
    }
}
