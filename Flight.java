//ADD YOUR HEADER

public class Flight {
    String flightNumber;
    String destination;
    int numberOfPassengers;
    Flight next;

    public Flight(String flightNumber, String destination, int numberOfPassengers){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.numberOfPassengers = numberOfPassengers;
        this.next = null;
    }

    public String toString(){
        return "\nFlight Number " + this.flightNumber + " going to " + this.destination + " has " + this.numberOfPassengers + " passengers" + ".\n";
    }

}
