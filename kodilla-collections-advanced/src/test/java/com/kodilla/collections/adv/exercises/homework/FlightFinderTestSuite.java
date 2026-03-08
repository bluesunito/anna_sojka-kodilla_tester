package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testFindFlightsFrom() {
        // given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsFrom("Warsaw");

        // then
        assertEquals(3, result.size());
        assertTrue(result.contains(new Flight("Warsaw", "London")));
        assertTrue(result.contains(new Flight("Warsaw", "Paris")));
        assertTrue(result.contains(new Flight("Warsaw", "Berlin")));
    }

    @Test
    void testFindFlightsTo() {
        // given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsTo("Warsaw");

        // then
        assertEquals(2, result.size());
        assertTrue(result.contains(new Flight("Berlin", "Warsaw")));
        assertTrue(result.contains(new Flight("Paris", "Warsaw")));
    }

    @Test
    void testFindFlightsFromWhenNoFlights() {
        // given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsFrom("Madrid");

        // then
        assertEquals(0, result.size());
    }
}