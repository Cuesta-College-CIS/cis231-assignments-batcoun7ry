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
    • The values in an array should be filled up with random values between O and 99 
        • After filling up the array, print all values in an array. 
    • Any Java Class, Module, or Package can be used. 
    • Test your program with various test data set 
    • no other restrictions 
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class FinalExam1 {

    // populate and return an 'n' sized array of random positive integers between 0 and 99:
    public static int[] fillArray(int n) {
        Random randGen = new Random();
        int [] nArray = new int[n];

        for (int i = 0; i < n; i++) {
            nArray[i] = randGen.nextInt(99);
        }

        return nArray;
    }

    // recieve an array of positive integers, sort, and return the array:
    public static int [] sortArray(int[] nArray) {

        // new array into which min elements of nArray will get sequentially pushed
        int [] nSortedArray = new int [nArray.length];
        int currentMinValue = -1; // initialize current min value

        // nested for loop: child loop pushes min value of nArray sequentially to nSortedArray
        for (int i = 0; i < nArray.length; i++) {
            currentMinValue = nArray[i]; // re-initialize currentMinValue to new set of unchecked elements
            // calcualte min value among unchecked elements of nArray
            for (int j = i; j < nArray.length; j++) {
                if (nArray[j] < currentMinValue) {
                    currentMinValue = nArray[j];
                }
            }
            // sequentially push currentMinValue to nSortedArray
            nSortedArray[i] = currentMinValue;
        }
        return nSortedArray;
    }
    
	public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        // prompt user for 'n' elements of array:
        System.out.println("Please input a positive integer for 'n' elements of an array.");
        int n = scnr.nextInt();

        // pass 'n' to a method that populates an array of 'n' random integers between 0 and 99.
        int nArray [] = fillArray(n);

        // report to the user what their array looks like:
        System.out.println("Your array of " + n + " elements looks like this:");
        System.out.println(Arrays.toString(nArray));

        // pass the array to a method that sorts the array:
        int [] nSortedArray = sortArray(nArray);
        
        // report to the user their sorted array:
        System.out.println("Your array of " + n + " elements has been sorted:");
        System.out.println(Arrays.toString(nSortedArray));


        // pass the sorted array to a method that finds its median:


        // report to the user what the median of their array is:
        System.out.println("The median of that array is: ");
	}    
}