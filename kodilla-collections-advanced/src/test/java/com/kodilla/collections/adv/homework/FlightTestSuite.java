package com.kodilla.collections.adv.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTestSuite {

    @Test
    public void testFlightFrom() {

    //when
        List<Flight> result = FlightFinder.findFlightsFrom("Cracow");
        //then
       List<Flight> flightsFrom = new ArrayList<>();
        flightsFrom.add(new Flight("Cracow", "Warsaw"));
        flightsFrom.add(new Flight("Cracow","Manchester"));
        assertEquals(flightsFrom,result);
    }
    @Test
    public void testFlightTo() {

        //when
        List<Flight> result = FlightFinder.findFlightsTo("Amsterdam");
        //then
        List<Flight> flightsTo = new ArrayList<>();
        flightsTo.add(new Flight("Moscow", "Amsterdam"));
        flightsTo.add(new Flight("Berlin","Amsterdam"));
        assertEquals(flightsTo,result);
    }

}
