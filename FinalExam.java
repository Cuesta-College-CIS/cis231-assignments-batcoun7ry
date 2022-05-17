/* 
Find the median value:
• There are n integer elements in an array. 
• Find the median value among the n integer values. (the value separating the higher half and lower half) 
    • For example, 
        • n= 5 integer values = 10 5 25 20 35 
        • output ( median value) = 20 
• Input : n (positive integer value, the number of elements which is odd number) 
• Output : the median value 
• Requirement:
    • Make the main() method as compact, simple and well-organized as you can 
        • Develop your own well-structured methods to find the median value 
        • Use any parameters to send the information to the function 
    • The values in an array should be filled up with random valuesbetween O and 99 
        • After filling up the array, print all values in an array. 
    • Any Java Class, Module, or Package can be used. 
    • Test your program with various test data set 
    • no other restrictions 
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class FinalExam {

    // populate and return an 'n' sized array of random positive integers between 0 and 99:
    public static int[] fillArray(int n) {
        Random randGen = new Random();
        int [] nArray = new int[n];

        for (int i = 0; i < n; i++) {
            nArray[i] = randGen.nextInt(99);
        }

        return nArray;
    }
    
	public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        // prompt user for 'n' elements of array:
        System.out.println("Please input a positive integer for 'n' elements of an array.");
        int n = scnr.nextInt();

        // pass 'n' to a method that populates an array of 'n' random integers between 0 and 99.
        int nArray [] = fillArray(n);

        // report to the user what the array looks like:
        System.out.println("Your array of " + n + " elements looks like this:");
        System.out.println(Arrays.toString(nArray));

        // report to the user what the median of the array is:
        System.out.println("The median of that array is: ");

	}    
}