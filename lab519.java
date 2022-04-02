/*
5.19 LAB: Insert an element into the sorted Array:

The program adds one value to the sorted integer array. The array has to keep
the sorted order after insertion.

This figure shows an example.

In this program, we assume that there is a sorted array with 5 integer elements
as follow:

int length = 5; // the number of actual value elements. int [] number = {5, 20,
30, 35, 50, 0, 0, 0, 0, 0};
- // the actual size of array is 10, but we use only 5 elements currently. The
  all 0’ values means the unused space where it will be allocated by the new
  insertion value. The input is one integer value to insert to the array.

25 The output is the all elements of array after the insertion

5 20 25 30 35 50
*/

import java.util.Scanner;

public class lab519 {
	public static void main(String[] args) {
        int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value, idx;

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt();

        for (idx = 0; idx < length; idx++) {
            if (insert_value < numbers[idx]) {
                break;
            }
        }

        for (int i = length - 1; i >= idx; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[idx] = insert_value;
	
		for (int i = 0; i < length + 1; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		scnr.close();
    }
}