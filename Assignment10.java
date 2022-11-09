//ADD YOUR HEADER

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment10 {
    public static void main(String[] args) {
        char input1;
        String line;


        //create a linked list to be used in this method.
        LinkedList flightQueue = new LinkedList();

        try {
            // print out the menu
            System.out.println("Welcome to Flight Management System:");
            printMenu();

            // create a BufferedReader object to read input from a keyboard
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(isr);

            do {
                System.out.print("What action would you like to perform?\n");
                line = stdin.readLine().trim();  //read a line
                input1 = line.charAt(0);
                input1 = Character.toUpperCase(input1);

                if (line.length() == 1)   //check if a user entered only one character
                {
                    switch (input1) {

                        case 'A':   // Add flight
                            System.out.println("Please enter flight number:");
                            String flightNumber = stdin.readLine().trim();
                            System.out.println("Please enter destination:");
                            String destination = stdin.readLine().trim();
                            System.out.println("Please enter number of passengers:");
                            String input = stdin.readLine().trim();
                            int numberOfPassengers = Integer.parseInt(input);
                            flightQueue.addFlight(flightNumber, destination, numberOfPassengers);
                            System.out.println("Fligh added successfully.\n");
                            break;

                        case 'C':   // Count passengers for a destination
                            System.out.println("Please enter the destination you'd like to count the number of passengers for:");
                            destination = stdin.readLine().trim();
                            int total = flightQueue.getNumberOfPassengers(destination);
                            System.out.printf("There are %d passengers flying to %s.\n\n", total, destination);
                            break;

                        case 'D':   // Get next flight in the queue
                            Flight nextInLine = flightQueue.removeFirstFlight();
                            if(nextInLine.numberOfPassengers == -1)
                                System.out.println("No flights scheduled for departure currently.\n");
                            else
                                System.out.printf("Next flight is %s going to %s with %d passengers on board.\n\n", 
                                    nextInLine.flightNumber, nextInLine.destination, nextInLine.numberOfPassengers);
                            break;

                        case 'L':   // List all the flights
                            String flightList = flightQueue.listFlights();
                            System.out.println(flightList);
                            break;

                        case 'P':   // Get position of a flight
                            System.out.println("Please enter the flight number you'd like to know the position of in the queue:");
                            input = stdin.readLine().trim();
                            int result = flightQueue.getPosition(input);
                            if(result == -1)
                                System.out.println("Flight not found, please try again.\n");
                            else
                                System.out.printf("Flight number %s is currently at position %d in the queue.\n\n", input, result + 1);
                            break;

                        case 'R':   // Remove a flight
                            System.out.println("Please enter the flight number you'd like to remove from the queue:");
                            input = stdin.readLine().trim();
                            Flight flight = flightQueue.removeFlight(input);
                            if(flight.numberOfPassengers == -1)
                                System.out.println("Flight not found, please try again.\n\n");
                            else
                                System.out.printf("Flight number %s going to %s has been cancelled.\n\n", flight.flightNumber, flight.destination);
                            break;
                        
                        case 'Q':   //Quit
                            break;

                        case '?':   //Display Menu
                            printMenu();
                            break;

                        default:
                            System.out.print("Unknown action\n");
                            break;
                    }
                }
            }while(input1 != 'Q' || line.length() != 1);
        }catch (IOException exception)
        {
            System.out.print("IO Exception\n");
        }
    }

    public static void printMenu()
    {
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd a new flight to the queue\n" +
                "C\t\tFind how many passengers are flying to a destination\n" +
                "D\t\tGet next flight in the queue\n" +
                "L\t\tList all flights in the queue\n" +
                "P\t\tFind the position of a flight in the queue\n" +
                "R\t\tRemove a flight from the queue\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Help\n\n");
    } //end of printMenu()
}
