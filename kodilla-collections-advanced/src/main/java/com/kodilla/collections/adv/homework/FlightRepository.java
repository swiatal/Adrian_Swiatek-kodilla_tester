package com.kodilla.collections.adv.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights =new ArrayList<>();
        flights.add(new Flight("Cracow", "Warsaw"));
        flights.add(new Flight("Cracow","Manchester"));
        flights.add(new Flight("Moscow", "Amsterdam"));
        flights.add(new Flight("Berlin", "Amsterdam"));
        return flights;
    }
    }

