package iterator;

import java.time.LocalTime;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }
    public Airport getFrom(){
        return from;
    }
    public Airport getTo(){
        return to;
    }
    public boolean sameLoc(Airport from, Airport to){
        return this.from == from && this.to == to;
    }
    public String toString(){
        double hours = java.time.Duration.between(startTime, endTime).toHours();
        double minutes = java.time.Duration.between(startTime, endTime).toMinutes();
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
