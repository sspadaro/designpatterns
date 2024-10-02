package iterator;

import java.util.ArrayList;
/**
 * Create a new airline
 * @author Sophia Spadaro
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;
    /**
     * Create a new airline
     * @param title name of the airline
     */
    public Airline(String title){
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }
    /**
     * get the name of the airline
     * @return the airline's name
     */
    public String getTitle(){
        return title;
    }
    /**
     * Create a new flight iterator
     * @param fromCode the name of the airport the flight leaves from
     * @param toCode the name of the airport the flight goes to
     * @return a new instance of flight iterator
     */
    public FlightIterator createIterator(String fromCode, String toCode){

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
