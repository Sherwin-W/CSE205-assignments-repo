// Assignment #: 1
//         Name: Sherwin Wang
//    StudentID: 1224486887
//      Lecture: M W F 10:10 AM - 11:00 AM
//  Description: 

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment2 {
    public static void main (String[] args){
       Scanner console = new Scanner(System.in);

       int number = console.nextInt();
       int countOdd = 0;
       int minInt = Integer.MAX_VALUE;
       int largestEven = Integer.MIN_VALUE;
       int sumPositive = 0;
       while(number != 0){
            if(number < minInt){
                minInt = number;
            }
            if(number > 0){
                sumPositive += number;
                if(number % 2 == 0){
                    if(number > largestEven){
                        largestEven = number;
                    }
                }
                else{
                    countOdd ++;
                }
            }
            number = console.nextInt();
       }

       System.out.print("The minimum integer is " + minInt +
                        "\nThe count of odd integers in the sequence is " + countOdd +
                        "\nThe largest even integer in the sequence is " + largestEven +
                        "\nThe sum of positive integers is " + sumPositive);
    }
}
