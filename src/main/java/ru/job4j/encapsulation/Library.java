package ru.job4j.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book("Clean code", 150);
        Book cleanloop = new Book("Clean loop", 150);
        Book cleanoop = new Book("Clean oop", 150);
        Book cleanalgo = new Book("Clean algo", 150);
        Book[] books = new Book[4];
        books[0] = cleancode;
        books[1] = cleanloop;
        books[2] = cleanoop;
        books[3] = cleanalgo;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getNumberPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
           Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName());
            }
        }
    }
}
