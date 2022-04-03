/*
Quiz 1_2_Question 1 : Find the i-th smallest number:

This program will take 10 user inputs and construct an integer array
Input begins with the number of elements 10 followed by 10 integer values
10 20 35 25 10 15 40 55 50 0 45
Swap the smallest value and the 1st array element
Swap the 2nd smallest value and 2nd array element
Swap the 3nd smallest value and 3rd array element
Swap the 4nd smallest value and 4th array element
Swap the 5nd smallest value and 5th array element
All other values have to keep the original place

Program Template Code
Link : https://github.com/Kwooley/CIS231/blob/main/Quiz1/quiz1template.java 
*/

import java.util.Arrays;
import java.util.Scanner;

public class quiz1_2_1 {
	public static void main(String[] args) {

        // initialize working variables:
		final int CNT = 5;
		int minval, minidx, tmp;

        // populate array with user values:
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = scnr.nextInt();
        }

        // print array for debugging:
	    System.out.println(Arrays.toString(numbers));

        // loop through array to find min element:
        minval = numbers[1];
        minidx = numbers[1];
        for (int i = 0; i < N; i++) {
            if (numbers[i] < minval) {
                minval = numbers[i];
                minidx = i; // save index of minval
            }
        }

        // print minval & minidx for debugging:
        System.out.println(
            "minval: " + minval + "\n" +
            "minidx: " + minidx
        );

        // switch numbers[0] with minval:
        tmp = numbers[0];
        numbers[0] = minval;
        numbers[minidx] = tmp;

        // print numbers[]:
        System.out.println(Arrays.toString(numbers));

        // close scanner:
		scnr.close();
	}
}

