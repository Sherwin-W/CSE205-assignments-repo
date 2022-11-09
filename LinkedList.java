//ADD YOUR HEADER

public class LinkedList {
    Flight first;
    int size;

    public LinkedList(){
        this.first = null;
        this.size = 0;
    }

    // Choice A
    public void addFlight(String flightNumber, String destination, int numberOfPassengers){
        Flight newFlight = new Flight(flightNumber, destination, numberOfPassengers);
        if(this.first == null){
            this.first = newFlight;
        }
        else{
            Flight pointer = first;
            while(pointer.next != null)
                pointer = pointer.next;

            pointer.next = newFlight;
        }
        this.size++;
    }

    // Choice C
    public int getNumberOfPassengers(String destination){
        Flight current = first;
        for(int i = 0; i < this.size; i++){
            if(current.toString().contains(destination)){
                return current.numberOfPassengers;
            }
            current = current.next;
        }
        return 0;
    }

    // Choice D
    public Flight removeFirstFlight(){
        Flight current = first;
        if(this.first != null){
            current = current.next;
        }
        return current;
    }

    // // Choice D
    // public String listFlights(){

    // }
    
    // // Choice E
    // public int getPosition(String flightNumber){

    // }

    // // Choice F
    // public Flight removeFlight(){

    // }

    // // Choice G
    // public Flight removeLastFlight(){

    // }

    // // Choice H
    // public Flight removeMiddleFlight(){

    // }

}
