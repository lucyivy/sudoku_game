package challenges.Flights;


public class Application {
    public static void main(String[] args) {
        FlightInquiry flightInquiry = new FlightInquiry();

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.searchFlight(flightInquiry);
    }
}