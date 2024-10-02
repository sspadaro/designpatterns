package iterator;

import java.time.LocalTime;

/**
 * Create a new flight
 * @author Sophia Spadaro
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Create a new instance of a flight
     * @param flightNum the flight's id number
     * @param from airport the flight is leaving from
     * @param to airport the flight is going to
     * @param startTime the time the flight starts
     * @param endTime the time the flight ends
     * @param numTransfers the number of transfers from start to end point
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }
    /**
     * get the airport that the flight is leaving from
     * @return the airport that the flight leaves from
     */
    public Airport getFrom(){
        return from;
    }
    /**
     * get the aiport that the flight is going to
     * @return the airport that the flight is going to
     */
    public Airport getTo(){
        return to;
    }
    /**
     * look for flights going to and from the specified airports
     * @param from airport the flight leaves from
     * @param to airport the flight goes to
     * @return true if the flight is going to and from the specified airports and false if it is not
     */
    public boolean sameLoc(Airport from, Airport to){
        return this.from == from && this.to == to;
    }
    /**
     * print out all of the flights, where they are coming and going from, their times and durations, and number of stops
     */
    public String toString(){
        long totalTime = java.time.Duration.between(startTime, endTime).toMinutes();
        long hours = totalTime/60;
        long minutes = totalTime%60;
        String stops = "";
        if(numTransfers == 0){
            stops = "Direct Flight";
        }else if(numTransfers == 1){
            stops = "1 Stopover";
        }else{
            stops = numTransfers+" Transfers";
        }
        return from+" to "+to+" "+startTime+" - "+endTime+" ("+hours+"h "+minutes+"m) "+stops;
    }
}
