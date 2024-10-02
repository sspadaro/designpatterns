package iterator;

import java.util.ArrayList;

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    public Airline(String title){
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }
    public String getTitle(){
        return title;
    }
    public FlightIterator createIterator(String fromCode, String toCode){
        fromCode = fromCode.toUpperCase();
        toCode = toCode.toUpperCase();

        try {
            Airport from = Airport.valueOf(fromCode);
            Airport to = Airport.valueOf(toCode);
            return new FlightIterator(flights, 0, from, to);

        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes");
            return null;
        }
    }
}
