/*
5.24 LAB: Two Dimensional Array:

Write a program that reads a list of inputs to construct a two dimensional
array.

Input begins with the number of rows N and the number of columns M followed by N
x M integer values.

For example, the input is

5 3 1 3 5 6 0 2 4 9 8 0 2 1 6 1 8 The first two inputs are to denote the number
of rows and columns. Thus the two dimensional array has 5 x 3 matrix. And every
3 values are for each row. {1, 3, 5} is the value of the first row and {6,0,2}
is the second row and so on.

The output is

[1, 3, 5] [6, 0, 2] [4, 9, 8] [0, 2, 1] [6, 1, 8] Output format Use the
toString( ) method of Class Array for(int i=0; i < numbers.length; i++)
System.out.println(Arrays.toString(numbers[i]);
*/

import java.util.Arrays;
import java.util.Scanner;

public class lab524 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		

 		int row = scnr.nextInt();
 		int col = scnr.nextInt();

 		int[][] numbers = new int[row][col];

		for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers [i] [j] = scnr.nextInt();
            }
        }

		for (int i = 0; i < numbers.length; i++)
			System.out.println(Arrays.toString(numbers[i]));
		scnr.close();
	}

}