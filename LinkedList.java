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
        Flight current = this.first;
        if(this.first != null){
            current = current.next;
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
        Flight current = this.first;
        Flight temp = current;
        if(this.first != null){
            for(int i = 0; i < this.size; i++){
                if(current.flightNumber.equals(flightNumber)){
                    temp = current;
                    break;
                }
                current = current.next;
            }
            temp.next = current.next;
            this.size--;
        }
        else{
            current = new EmptyFlight();
        }
        return current;
    }
}
