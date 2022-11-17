package com.kodilla.collections.adv.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> departureBoard = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                departureBoard.add(flight);
            }
        }
        return departureBoard;
    }

    public static List<Flight> findFlightsTo(String arrival) {
        List<Flight> arrivalBoard = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                arrivalBoard.add(flight);
            }
        }
        return arrivalBoard;
    }
}
