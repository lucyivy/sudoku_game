package challenges.Flights;

public class FlightInquiry {
    public Flight inquire() {

        String departureCity = "Berlin";
        String arrivalCity = "Vienna";

        return new Flight(departureCity, arrivalCity);
    }
}
