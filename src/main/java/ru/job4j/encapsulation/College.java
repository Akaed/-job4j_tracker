package ru.job4j.encapsulation;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setGroup(14);
        student.setAdmission("14.09.2022");
        System.out.println(student.getName() + " " + student.getGroup() + " " + student.getAdmission());
    }
}
