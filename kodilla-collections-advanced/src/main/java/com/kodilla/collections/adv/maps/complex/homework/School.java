package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Integer> students = new ArrayList<>();

    public School(String name, List<Integer> students) {
        this.name = name;
        this.students = students;
    }

    public int getTotalStudents() {
        int sum = 0;

        for (int number : students) {
            sum += number;
        }

        return sum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Classes: " + students.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return name.equals(school.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}