/*
Your program should delete one element from the unsorted array.

The first part of this work will be finding the target value. Once you find the
value in the array, you should delete it and then shift left all rest of the
elements after the deleted element in order not to leave it as a blank.

1. Here is a figure to explain how to delete an element

2. Here is the link to Google slide:

In this program, we assume that The array numbers is declared as follow int []
numbers = {45, 20, 30, 35, 10}; // actual array length is 5. After deletion, the
length will be decreased by 1 There is no duplicated number in array. If there
is no matched target value, just print all original elements. The input begins
with an integer indicating the target value for deletion.

30 The output is all elements of the array after deletion

45 20 35 10
*/

import java.util.Scanner;

public class lab520 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int idx, length, target, flag;
		int[] numbers = { 45, 20, 30, 35, 10 };

		flag = 0;
		target = scnr.nextInt();
		length = numbers.length;
		
		for (idx = 0; idx < length; idx++) {
            if (target == numbers[idx]) {
                flag = 1;
                break;
            }
        }
		
        if (flag == 1) {
            for (int i = idx; i < length - 1; i++) {
                numbers[i] = numbers[i +1];
            }
            length --;
        }
		
		for (int i = 0; i < length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

		scnr.close();
	}
}
