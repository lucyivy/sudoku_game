package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flightLonPar = new Flight("London", "Paris");
        Flight flightParRyb = new Flight("Paris", "Rybnik");
        Flight flightLonBer = new Flight("London", "Berlin");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flightLonPar);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, no connections found. Error : " + e);
        } finally {
            System.out.println("Thank you for using our flight finding services! \n");
        }

        try {
            flightFinder.findFlight(flightParRyb);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, no connections found. Error: " + e);
        } finally {
            System.out.println("Thank you for using our flight finding services! \n");
        }

        try {
            flightFinder.findFlight(flightLonBer);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, no connections found. Error: " + e);
        } finally {
            System.out.println("Thank you for using our flight finding services! \n");
        }
    }
}