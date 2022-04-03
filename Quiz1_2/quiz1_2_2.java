/*
Quiz 1_2_Question_2: Matrix Multiplication

L = 3
M = 3
N = 2

Matrix 1 = L * M; (3 * 3) (Check code for values)
Matrix 2 = M * N; (3 * 2) (Check code for values)

Take user imput for row index of matrix 1. That row is itself an array in which
each element is to be multiplied with each element of each column of matrix 2.
Each multiplication of each column number should be added, yeilding  one
output nunmber per collumn. For example:

User input is 1, so we need the array in row index 1 of matrix 1, which is 
{3, 6, 9}. Then we multiply:
((3 * 10) + (6 * 30) + (9 * 50)) = 660 (our first output number).
((3 * 20) + (6 * 40) + (9 * 60)) = 840 (our second output number).
*/

import java.util.Arrays;
import java.util.Scanner;

public class quiz1_2_2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { 
                { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } 
        };
		int[][] matrix2 = { 
                { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } 
        };
		int rowidx = scnr.nextInt();

		// Your code

	}
}