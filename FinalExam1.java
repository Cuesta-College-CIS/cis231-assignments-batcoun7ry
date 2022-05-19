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
        Arrays.sort(nArray);
        return nArray;
    }




    // find median of sorted array:
    public static int findMedian(int[] nArray) {
        int median = nArray[nArray.length/2];
        return median;
    }




    // find max subsequence of length m of unsorted array:
    public static int [] findMaxSubsequence(int[] nArray){
        int [] maxSubsequence = new int [3];
        int currentMaxSub = -1;

        for (int i = 0; i < maxSubsequence.length - 2; i++) {
            if ( (nArray[i] + nArray[i + 1] + nArray[i + 2]) > currentMaxSub) {
                currentMaxSub = nArray[i] + nArray[i + 1] + nArray[i + 2];

                // fill array MaxSubsequence with the current max subsequence:
                maxSubsequence[0] = nArray[i + 0];
                maxSubsequence[1] = nArray[i + 1];
                maxSubsequence[2] = nArray[i + 2];
            }
        }
        return maxSubsequence;
    }


    

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        // prompt user for 'n' elements of array:
        System.out.println("Please input a positive integer for 'n' elements of an array.");
        int n = scnr.nextInt();

        // pass 'n' to a method that populates an array of 'n' random integers between 0 and 99.
        int [] nArray = fillArray(n);

        // report to the user what their array looks like:
        System.out.println("\nYour array of " + n + " elements looks like this:");
        System.out.println(Arrays.toString(nArray));

        // report to the user what the max subsequence of 3 elements is:
        int [] maxSubsequence = findMaxSubsequence(nArray);
        System.out.println("\nThe maximum subsequence of 3 integers is " + Arrays.toString(maxSubsequence));

        // pass the array to a method that sorts the array:
        nArray = sortArray(nArray);

        // report to the user their sorted array:
        System.out.println("\nYour array of " + n + " elements has been sorted:");
        System.out.println(Arrays.toString(nArray));


        // pass the sorted array to a method that finds its median:
        int median = findMedian(nArray); 

        // report to the user what the median of their array is:
        System.out.println("\nThe median of that array is: " + median);

    }    
} 