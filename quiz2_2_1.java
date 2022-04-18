/*
Make program that has 4 user-defined functions to:
    // construct two integer arrays with random values (0-99), return the array
    (1) public static int[] constructArray(Scanner scnr)

    //print all elements in each array
    (2) public static void printArray(int[])

    //determine whcih array has more even numbers and return the array number
    (3) public static int findMoreEvens(int[] n1, int[] n2)
        // in main function, print the message
        // output example: Array 2 has more even numbers
    

    // derermine which array has the grteatest value and return the array number
    (4) public static int findGreatest(int[] n1, int[] n2)
        // in main function, print the array number and the greatest value together
        // output example: Array 1 has the greatest value 99
*/


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class quiz2_2_1 {

    // construct two integer arrays with random values (0-99), return the array
    // take user input (N) for the size of the array
    public static int[] constructArray(Scanner scnr) {

        Random randGen = new Random(); // make random number generator
        System.out.print("Enter number of elements for Array:"); // prompt user
        int N = scnr.nextInt(); // get user's N
        int [] array = new int[N]; // make array with N elements

        // loop through array and populate each element with random number:
        for (int i = 0; i < array.length; i++) {
            array[i] = randGen.nextInt(100);
        }
        return array;
    }

    // print all elements in each array
    public static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    // determine which array has more even numbers and return the array number
    public static int findMoreEvens(int[] n1, int[] n2) {

        // loop through array1, count evens
        int countEven1 = 0;
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] % 2 == 0) {
                countEven1 += 1;
            }
        }

        // loop through array2, count evens
        int countEven2 = 0;
        for (int i = 0; i < n2.length; i++) {
            if (n1[i] % 2 == 0) {
                countEven1 += 1;
            }
        }

        // compare both arrays, return array with greatest evens
        if (countEven1 > countEven2) {
            return 1;
        } else if (countEven1 == countEven2); {
            return 12;
        } else {
            return 2;
        }
    }

    // derermine which array has the grteatest value and return the array number
    // public static int findGreatest(int[] n1, int[] n2) {

    //}

	public static void main(String[] args) {

        // make scanner object:
		Scanner scnr = new Scanner(System.in);

        // make array1, populate it with user's N, print
        int [] array1;
        array1 = constructArray(scnr);
        printArray(array1);

        // make array2, populate it with another N, print
        int [] array2;
        array2 = constructArray(scnr);
        printArray(array2);

        // print which array has most even elements
        int even = findMoreEvens(array1, array2);
        System.out.println("Array " + even + " has the most even elements.");


	}
}