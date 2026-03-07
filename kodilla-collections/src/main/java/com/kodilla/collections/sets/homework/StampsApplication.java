package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("flower", 15, 10, true));
        stamps.add(new Stamp("flower", 15, 10, false));
        stamps.add(new Stamp("car", 15, 10, true));
        stamps.add(new Stamp("tower", 10, 15, false));
        stamps.add(new Stamp("flower", 15, 10, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
