package challenges.Flights;

import java.util.ArrayList;

public class FlightDatabase {
    private ArrayList<Flight> database;

    public FlightDatabase() {
        this.database = new ArrayList<>();
        database.add(new Flight("Berlin", "Moscow"));
        database.add(new Flight("Paris", "Berlin"));
        database.add(new Flight("Paris", "Rome"));
        database.add(new Flight("Prague", "Vienna"));
        database.add(new Flight("Vienna", "Moscow"));
        database.add(new Flight("Prague", "Rome"));
    }

    public ArrayList<Flight> getDatabase() {
        return database;
    }
}
