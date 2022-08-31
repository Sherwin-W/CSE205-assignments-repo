// Assignment #: 1
//         Name: Sherwin Wang
//    StudentID: 1224486887
//      Lecture: M W F 10:10 AM - 11:00 AM
//  Description: Reads a sequence of integers and outputs the minimum integer, count of odd integers, largest even integer, and the sum of positive integers.

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment2 {
    public static void main (String[] args){
       Scanner console = new Scanner(System.in);

       int number = console.nextInt();
       int countOdd = 0;
       int minInt = 0;
       int largestEven = 0;
       int sumPositive = 0;
       while(number != 0){
            if(number < minInt){
                minInt = number;
            }
            if(number % 2 != 0){
                countOdd ++;
            }
            if(number > 0){
                sumPositive += number;
                if(number % 2 == 0){
                    if(number > largestEven){
                        largestEven = number;
                    }
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
