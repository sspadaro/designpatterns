package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creates a new flight iterator that implements the Iterator class
 * @author Sophia Spadaro
 */
public class FlightIterator implements Iterator<Flight>{
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Creates a new instance of flight iterator
     * @param flights array list of flights
     * @param position position in the array list (index)
     * @param from airport the flight is leaving from
     * @param to airport the flight is travelling to
     */
    public FlightIterator(ArrayList<Flight> flights, int position, Airport from, Airport to){
        this.flights = flights;
        this.position = position;
        this.from = from;
        this.to = to;
    }
    /**
     * Checks if the arraylist of flights has another flight
     * @return true if the list has another flight and false if it does not
     */
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
    /**
     * Move to the next position in the array list and return the flight at that position
     * @return flight at the next position in the list
     */
    public Flight next(){
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}