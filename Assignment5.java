/* Assignment #: 5
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: This class provides an interface for the program, and calls upon the methods created by other classes to accept information,
                create AircraftEntities, compute their attack powers, show how many aircrafts match the desired attack power range, and
                display the information in an orderly list.
*/

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5 {
	public static void main(String[] args) {
        char input;
        String line;
        String inputInfo;

        // ArrayList used to store the aircraft objects
        ArrayList<AircraftEntity> aircraftList = new ArrayList<>();

        try{
            System.out.println("Welcome to the aircraft stats simulator!");
            printMenu();

            // create a BufferedREader object to read input from a keyboard
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(isr);
            AircraftParser parser = new AircraftParser();
            AircraftEntity plane;

            do{
                System.out.println("\nWhat action would you like to perform?");
                line = stdin.readLine().trim();
                input = line.charAt(0);
                input = Character.toUpperCase(input);

                if(line.length() == 1){
                    switch (input){
                        case 'A': // add aircraft to the fleet
                            System.out.println("Please enter your aircraft stats:");
                            inputInfo = stdin.readLine().trim();
                            plane = parser.parseNewAircraft(inputInfo);
                            aircraftList.add(plane);
                            //creates an aircraft object (child of AircraftEntity) and add it to the aircraft list
                            break;

                        case 'C': // calculate attack powers
                            AircraftEntity placer;
                            for(int i = 0; i < aircraftList.size(); i++){
                                aircraftList.get(i).computeAttackPower();
                            }
                            //computes the attack power for all the aircrafts in the list
                            System.out.println("Attack powers computed");
                            break;

                        case 'D': // how many aircrafts have attack power equal to or larger than a user-defined value
                            System.out.print("Please enter a minimum attack power you want to calculate:\n");
                            inputInfo = stdin.readLine().trim();
                            int min = Integer.parseInt(inputInfo);
                            int count = 0;
                            int power = 0;
                            for(int i = 0; i < aircraftList.size(); i++){
                                placer = aircraftList.get(i);
                                power = placer.getAttackPower();
                                if(power >= min){
                                    count++;
                                }
                            }
                            //counts how many aircrafts in the list have attack powers equal to or larger than input
                            System.out.println("The number of aircrafts with " + min
                                    + " attack powers or more is: " + count);
                            break;

                        case 'L': // list aircrafts
                            if(aircraftList.isEmpty()){
                                System.out.println("No aircrafts in the fleet yet.\n");
                            }
                            else{
                                for(int i = 0; i < aircraftList.size(); i++){
                                    placer = aircraftList.get(i);
                                    System.out.println(placer.toString());
                                }
                            }
                            break;

                        case 'Q':
                            break;

                        case '?':
                            printMenu();
                            break;

                        default:
                            System.out.println("Unknown action\n");
                            break;
                    }
                }
                else
                    System.out.println("Unknown action");

            }while (input != 'Q');
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
	}

    public static void printMenu(){
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd Aircraft\n" +
                "C\t\tCompute Attack Power\n" +
                "D\t\tCalculate the Number of Aircrafts with Minimum Attack Power\n" +
                "L\t\tList Aircrafts\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Help\n\n");
    }
}
