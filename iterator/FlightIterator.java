package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator<Flight>{
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    public FlightIterator(ArrayList<Flight> flights, int position, Airport from, Airport to){
        this.flights = flights;
        this.position = position;
        this.from = from;
        this.to = to;
    }
    public boolean hasNext(){
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }
    public Flight next(){
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}