/*
5.21 LAB: Merge Two Arrays:

We will merge two integer arrays. Your program should use an extra array for the
merged array. The array that has the shorter length than another one will be
placed in the ahead, the longer one should be placed at the last of the result
array. When two arrays have the same length, any can be placed in the first
half.

Figure 1: Example

The input begins with an integer indicating the number of values follow for the
1st array. after the first array values, there is an another integer indicating
the number of values follow for the 1st array. For example

3 1 2 3 4 4 5 6 7 3: the number of elements in the first array. 4: the number of
elements in the second array The output is 1 2 3 4 5 6 7 In this program, we
assume that the length of two arrays are always less than or equal to 10. Thus,
the length of result array is at most 20.
*/

import java.util.Scanner;

public class lab521 {
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

        // Populate mergedArray with smallest array:
        if (firstArraySize <= secondArraySize) {
            for (int i = 0; i < firstArraySize; i++) {
                mergedArray[i] = firstArray[i];
            }
            for (int i = 0; i < secondArraySize; i++) {
                mergedArray[firstArraySize + i] = secondArray[i];
            }
        } else {
            for (int i = 0; i < secondArraySize; i++) {
                mergedArray[i] = secondArray[i];
            }
            for (int i = 0; i < firstArraySize; i++) {
                mergedArray[secondArraySize + i] = firstArray[i];
            }
        }

        // Print mergedArray:
        for (int i = 0; i < mergedArraySize; i++) {
            System.out.print(mergedArray[i] + " ");
	    }

        System.out.print("\n");
    }
}
