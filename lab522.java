/*
5.22 LAB: Shuffle Two Arrays:

We will shuffle two integer arrays, and then make an extra array with two array
values. 

The program copies all elements of the first array and the second array
alternatively. The shuffle will start with the first array element.

The odd elements of the result array have the elements in the first array and
the even elements have the second array elements. If there is no more elements
in one array, the remainder of the other one will be copied to the last of
result array as itself.

Example Figure:

Hint: The index of the 1st array i is the index of the result array (2 * i ) The
index of the 2nd array i is the index of the result array = (2 * i + 1) The
input begins with an integer indicating the number of values follow for the 1st
array. after the first array values, there is an another integer indicating the
number of values follow for the 1st array. For example

3 1 2 3 4 4 5 6 7 3: the number of elements in the first array. 4: the number of
elements in the second array The output is 1 4 2 5 3 6 7 In this program, we
assume that the length of two arrays are always less than or equal to 10. Thus,
the length of result array is at most 20.
*/

import java.util.Scanner;

public class lab522 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        // Initialize and populate firstArray:
        int firstArraySize = scnr.nextInt();
        int firstArray[] = new int[firstArraySize];
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = scnr.nextInt();
        }

        // Initialize and populate secondArray:
        int secondArraySize = scnr.nextInt();
        int secondArray[] = new int[secondArraySize];
        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = scnr.nextInt();
        }

        // Initialize mergedArray:
        int mergedArraySize = firstArraySize + secondArraySize;
        int mergedArray[] = new int[mergedArraySize];

        // Determine minimum array length with fancy ternary opperator:
        int minLength = (firstArraySize < secondArraySize) ? firstArraySize : secondArraySize;

        // Shuffel both arrays into mergedArray untill minimum array length is reached:
        for (int i = 0; i < minLength; i++) {
            mergedArray[i * 2] = firstArray[i];
            mergedArray[i * 2 + 1] = secondArray[i];
        }

        // Populate mergedArray with remaing sequential elements from longer array:
        if (minLength == firstArraySize) {
            for (int i = 0; i < secondArraySize - firstArraySize; i++) {
                mergedArray[i + firstArraySize * 2] = secondArray[i + firstArraySize]; 
            }
        } else {
            for (int i = 0; i < firstArraySize - secondArraySize; i++) {
                mergedArray[i + secondArraySize * 2] = firstArray[i + secondArraySize];
            }
        }

        // Print mergedArray with fancy for-each loop:
        for (int v : mergedArray) {
            System.out.print(v + " ");
	    }

        System.out.print("\n");
    }
}
