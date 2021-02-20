package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petr Petrov");
        student.setGroup(1);
        student.setReceipt(new Date());
        System.out.println("Student " + student.getFullName() + " from group " + student.getGroup()
                + " entered " + student.getReceipt());
    }
}
