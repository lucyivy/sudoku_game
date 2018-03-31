package challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    FlightDatabase flightDatabase = new FlightDatabase();

    public boolean validate(FlightInquiry flightInquiry) {
        boolean isDepartureCityServiced = false;
        boolean isArrivalCityServiced = false;
        for (Flight flight : flightDatabase.getDatabase()) {
            if (flight.fliesTo(flightInquiry.inquire().getArrivalAirport())) {
                isDepartureCityServiced = true;
                break;
            }
        }
        for (Flight flight : flightDatabase.getDatabase()) {
            if (flight.fliesTo(flightInquiry.inquire().getDepartureAirport())) {
                isArrivalCityServiced = true;
                break;
            }
        }
        return (isDepartureCityServiced & isArrivalCityServiced);
    }

    public void searchFlight(FlightInquiry flightInquiry) {

        boolean connectionsAvailable = validate(flightInquiry);
        boolean directConnectionAvailable = false;


        if (connectionsAvailable) {

            List<String> directFlights = flightDatabase.getDatabase().stream()
                    .filter((n -> n.fliesTo(flightInquiry.inquire().getArrivalAirport())))
                    .map(n -> n.getCounterpart(flightInquiry.inquire().getArrivalAirport()))
                    .collect(Collectors.toList());

            System.out.println("Searching for direct flights from " + flightInquiry.inquire().getDepartureAirport() +
                    " to " + flightInquiry.inquire().getArrivalAirport());
            System.out.println("The following connections operate from and to Berlin: " + directFlights);

            directFlights = directFlights.stream()
                    .filter(n -> n.equals(flightInquiry.inquire().getDepartureAirport()))
                    .collect(Collectors.toList());

            if (!(directFlights.size() == 0)) {
                directConnectionAvailable = true;
                System.out.println("Direct connection found!");
            }


            if (!directConnectionAvailable) {
                System.out.println("\nDirect flights unavailable - searching for indirect flights");

                List<String> City1List = flightDatabase.getDatabase().stream()
                        .filter(n -> n.fliesTo(flightInquiry.inquire().getArrivalAirport()))
                        .map(n -> n.getCounterpart(flightInquiry.inquire().getArrivalAirport()))
                        .collect(Collectors.toList());

                List<String> resultList = flightDatabase.getDatabase().stream()
                        .filter(n -> n.fliesTo(flightInquiry.inquire().getDepartureAirport()))
                        .map(n -> n.getCounterpart(flightInquiry.inquire().getDepartureAirport()))
                        .filter(n -> City1List.contains(n))
                        .collect(Collectors.toList());

                System.out.println("\nIndirect connections available via : " + resultList);

            }
        } else {
            System.out.println("Sorry, we do not operate, neither directly nor indirectly," +
                    "between the cities requested");
        }
    }
}