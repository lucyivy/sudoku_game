package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> connections = new HashMap<String, Boolean>();
        connections.put("London", true);
        connections.put("Paris", true);
        connections.put("Vienna", true);
        connections.put("Rome", false);
        connections.put("Radom", false);
        connections.put("Rybnik", false);

        boolean departurePossible = false;
        boolean arrivalPossible = false;

        if (connections.containsKey(flight.getDepartureAirport()) && connections.containsKey(flight.getArrivalAirport())) {
            if (connections.get(flight.getDepartureAirport())) {
                departurePossible = true;
            } else {
                System.out.println("Sorry, no direct connections between those cities.");
            }
            if (connections.get(flight.getArrivalAirport())) {
                arrivalPossible = true;
            } else {
                System.out.println("Sorry, no direct connections between those cities.");
            }
        } else {
            throw new RouteNotFoundException();
        }

        if (departurePossible && arrivalPossible) {
            System.out.println("Connections found.");
        }
    }
}