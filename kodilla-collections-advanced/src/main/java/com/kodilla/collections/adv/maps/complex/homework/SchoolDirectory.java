package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<School, Principal> directory = new HashMap<>();

        Principal principal1 = new Principal("Seymour", "Skinner");
        Principal principal2 = new Principal("Albus", "Dumbledore");
        Principal principal3 = new Principal("Joe", "Clark");

        School school1 = new School("Springfield Elementary", Arrays.asList(25, 27, 26, 24));

        School school2 = new School("Hogwarts", Arrays.asList(40, 38, 35, 37));

        School school3 = new School("Eastside High", Arrays.asList(30, 29, 28));

        directory.put(school1, principal1);
        directory.put(school2, principal2);
        directory.put(school3, principal3);

        for (Map.Entry<School, Principal> entry : directory.entrySet()) {

            System.out.println(
                    "Principal: " + entry.getValue().getFirstname() + " " +
                            entry.getValue().getLastname() +
                            ", School: " + entry.getKey().getName() +
                            ", Total students: " + entry.getKey().getTotalStudents()
            );
        }
    }
}