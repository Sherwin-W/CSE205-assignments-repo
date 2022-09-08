/* Assignment #: 4
Name: Sherwin Wang
StudentID: 1224486887
Lecture: M W F 10:10 AM - 11:00 AM
 Description: Assignment 4 class displays a menu of choices to a user
 and performs the chosen task. It will keep asking a user to
 enter the next choice until the choice of 'Q' (Quit) is entered.
 */

import java.util.*;

public class Assignment4
 {
  public static void main (String[] args)
   {
       // Local variables (can be accessed anywhere from the main method)
	   String line = new String(); char input1 = 'Z'; // Variables for menu input
       String name, division, location; // Variables for Department class
       String firstName, lastName,  managingSince ; int yearsExperience = 0; // Variables for Manager class 

       // Instantiate a Department object
       Department dpt = null;

       printMenu();

       //Create a Scanner object to read user input
       Scanner scan = new Scanner(System.in);

       do  // Will ask for user input
        {
            System.out.println("What action would you like to perform?");
            line = scan.nextLine();

            if (line.length() == 1)
            {
                input1 = line.charAt(0);
                input1 = Character.toUpperCase(input1);

                // matches one of the case statement
                switch (input1)
                {
                    case 'A':   //Add a new Department
                    	// Enter Manager related information
					    System.out.print("Please enter the Manager's information:\n");
					    System.out.print("Enter manager's first name:\t");
					    firstName = scan.nextLine();
					    System.out.print("Enter manager's last name:\t");
					    lastName = scan.nextLine();
					    System.out.print("Enter managers's total years of experience:\t");
					    yearsExperience = scan.nextInt();
					    scan.nextLine(); // to read "/n"
					    System.out.print("Enter since when the manager is managing this department:\t");
					    managingSince = scan.nextLine();
                        Manager dptManager = new Manager(firstName, lastName, yearsExperience, managingSince);
                        
                        // Enter Department related information
                        System.out.print("\nPlease enter the Department's information:");
                        System.out.print("\nEnter department's name:\t");
                        name = scan.nextLine();
                        System.out.print("Enter department's division:\t");
                        division = scan.nextLine();
                        System.out.print("Enter department's location:\t");
                        location = scan.nextLine();
                        dpt = new Department(name, dptManager, division, location);
                        break;
                        
                    case 'D':   //Display Department
                        System.out.print(dpt.toString());
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
         else
          {
              System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q' || line.length() != 1);
       scan.close();
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Department\n" +
                        "D\t\tDisplay Department\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }

}
