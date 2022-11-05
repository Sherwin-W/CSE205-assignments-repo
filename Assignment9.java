// Assignment: 9
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: Assignment 9 main class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Assignment9 {
    int biggestPrime = 0;
    public static void main(String[] args) {
        char input = ' ';
        String line = "";
        int[] ints;
        boolean isPalindrome;

        try {
            printMenu();
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader buff = new BufferedReader(streamReader);

            do{

            line = buff.readLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
            input = line.charAt(0);

                switch(input){
                    case '1': 
                        ints = parseInts(buff);
                        printMenu();
                        break;
                    case '2':
                        ints = parseInts(buff);  
                        System.out.println("The sum of all even numbers in the array is: " + addEvens(ints, 0, 0));
                        printMenu(); 
                        break;
                    case '3':
                        System.out.print("Please enter String:\n");
                        line = buff.readLine().trim();
                        if (line.isEmpty()) {
                            continue;
                        }
                        if(isPalindrome(line, 0, line.length()-1)){
                            isPalindrome = true;
                        }
                        else{
                            isPalindrome = false;
                        }
                        System.out.println("Palindrome test result is: "  + isPalindrome);
                        printMenu();
                        break;
                    case '4':
                        System.out.print("Please enter String:\n");
                        line = buff.readLine().trim();
                        System.out.println("String after removing all occurrences of character \"A\": " + removeA(line, 'A'));
                        printMenu();
                        break;
                    case '5':
                        break;
                }
            }while(input != '5' || line.length() != 1);
            
        } catch (IOException e) {
            System.out.print("IO Exception\n");
        }
	
    }


    // Utility method for printing the menu 
    public static void printMenu() {
        System.out.print("\nWhat would you like to do?\n\n");
        System.out.print("1: Find the largest prime number in an array of integers\n");
        System.out.print("2: Calculate the sum of all even numbers in an array of integers\n");
        System.out.print("3: Check if a string is palindrome or not\n");
        System.out.print("4: Remove all occurrences of character \"A\" in a String\n");
        System.out.print("5: Quit\n\n");
    }

    // utility method for parsing integers from standard input
    public static int[] parseInts(BufferedReader reader) {
        String line = "";
        ArrayList<Integer> container = new ArrayList<>();
        try {
            System.out.print("Please enter integers:\n");
            line = reader.readLine();
            int num = Integer.parseInt(line);

            while (num != 0) {
                container.add(num);
                line = reader.readLine();
                num = Integer.parseInt(line);
            }

        } catch (IOException ex) {
            System.out.println("IO Exception");
        }

        int[] result = new int[container.size()];
         for(int i = 0; i < container.size(); i++){
             result[i] = container.get(i);
         }
        return result;
    }
    // public static int findPrime(int[] ints, int place, int base){
    //     int result = 0;
    //         if(base < ints[place]){
    //             if(ints[place] % base == 0){
    //             findPrime(ints, place++, base);
    //         }
    //         else{
    //             findPrime(ints, place, base++);
    //         }
    //     }
    //     else{
    //         if(ints[place] > this.biggestPrime){
    //             this.biggestPrime = ints[place];
    //         }
    //     }
    //     return result;
    // } 
    public static int addEvens(int[] ints, int place, int total){
        if(place == ints.length){
            return total;
        }
        if(ints[place] % 2 == 0){
            total += ints[place];
        }
        return addEvens(ints, place + 1, total);
    }
    public static boolean isPalindrome(String str, int start, int end){
        if(start == end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        if(start < end + 1){
            return isPalindrome(str, start + 1, end - 1);
        }
            return true;
    }
    public static String removeA(String str, char remove){
        if(str.length() == 0){
            return "";
        }
        if(str.charAt(0) == remove){
            return removeA(str.substring(1), remove);
        }
        return str.charAt(0) + removeA(str.substring(1), remove);
    }
}
