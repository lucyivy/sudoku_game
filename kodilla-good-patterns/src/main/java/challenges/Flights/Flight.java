package challenges.Flights;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        return result;
    }

    public String getCounterpart(String city) {
        if (this.departureAirport.equals(city)) {
            return this.arrivalAirport;
        } else if (this.arrivalAirport.equals(city)) {
            return this.departureAirport;
        } else {
            System.out.println("Argument invalid!");
            return null;
        }
    }

    public boolean fliesTo(String city) {
        if (getArrivalAirport().equals(city) || getDepartureAirport().equals(city)) {
            return true;
        } else {
            return false;
        }
    }
}