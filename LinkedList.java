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
        int total = 0;
        for(int i = 0; i < this.size; i++){
            if(current.toString().contains(destination)){
                total += current.numberOfPassengers;
            }
            current = current.next;
        }
        return total;
    }

    // Choice D
    public Flight removeFirstFlight(){
        Flight current = this.first;
        if(this.first != null){
            this.first = this.first.next;
            this.size--;
        }
        else{
            current = new EmptyFlight();
        }
        return current;
    }

    // Choice L
    public String listFlights(){
        Flight current = this.first;
        String result = "";
        if(current != null){
            for(int i = 0; i < this.size; i++){
                result += current.toString();
                current = current.next;
            }
            result += "\nTotal flights: " + this.size + ".\n";
        }
        else{
            result += "No flights scheduled for departure at this time.\n";
        }

        return result;
    }
    
    // Choice Q
    public int getPosition(String flightNumber){
        Flight current = this.first;
        int result = -1;
        for(int i = 0; i < this.size; i++){
            if(current.flightNumber.equals(flightNumber)){
                result = i;
            }
            current = current.next;
        }
        return result;
    }

    // Choice R
    public Flight removeFlight(String flightNumber){
        Flight result = new EmptyFlight();
        if(this.first.flightNumber.equals(flightNumber)){
            this.first = this.first.next;
            return this.first;
        }
        while(this.first != null && this.first.flightNumber.equals(flightNumber)){
            this.first = this.first.next;
        }
        Flight current = this.first;
        while(current != null && current.next != null){
            if(current.next.flightNumber.equals(flightNumber)){
                result = current.next;
                current.next = current.next.next;
                size--;
            }
            else{
                current = current.next;
            }
        }

        return result;
    }
}
