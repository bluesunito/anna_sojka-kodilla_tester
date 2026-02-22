package com.kodilla.abstracts.homework;

public class ApplicationJob {

    public static void main(String[] args) {

        Job developer = new JavaDeveloper();
        Job tester = new JavaTester();
        Job teacher = new JavaTeacher();

        Person person1 = new Person("Anna", 30, developer);
        Person person2 = new Person("Jan", 45, tester);
        Person person3 = new Person("Kasia", 38, teacher);

        person1.showResponsibilities();
        person2.showResponsibilities();
        person3.showResponsibilities();
    }
}
