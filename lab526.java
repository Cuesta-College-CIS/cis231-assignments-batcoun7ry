/*
5.26 LAB: Two Dimensional Array 3:

This program counts the cross shape in two dimensional array N x M.

We say there is a cross shape in the (i,j) position if and only if

the cell (i,j ) is 1, and every up(i-1, j), down(i+1, j, left(i,j-1) and
right(i,j+1) cell is 1 Here is an figure of example in 10x10 array.

Input begins with the number of rows N and the number of columns M followed by N
x M integer values. For example, the input is

3 3 0 1 0 1 1 1 0 1 0 The first two inputs are to denote the number of rows and
columns. Thus the two dimensional array has 3 x 3 matrix. {0, 1, 0} is the value
of the first row and {1, 1, 1} is the second row and {0, 1, 0} is the last row

The output is

1
*/


import java.util.Scanner;
import java.util.Arrays;

public class lab526 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        // initilize array from first to user ints:
		int N = scnr.nextInt();
		int M = scnr.nextInt();
		int[][] numbers = new int[N][M];
		int cnt = 0;

        // populate array with user ints, detect error with try/catch:
		try {
			for (int i = 0; i < numbers.length; i++)
				for (int j = 0; j < numbers[i].length; j++)
					numbers[i][j] = scnr.nextInt();
		} catch (Exception e) {
			System.err.println("Input Error");
			e.printStackTrace();
		}

        // print array for debugging:
		for (int i = 0; i < N; i++)
		System.out.println(Arrays.toString(numbers[i]));

        // calculate number of crosses:
        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                if (numbers[i][j] == 1) {
                    if (
                    numbers[i - 1][j] == 1 &&
                    numbers[i + 1][j] == 1 && 
                    numbers[i][j - 1] == 1 && 
                    numbers[i][j +1] == 1
                    ) {
                        cnt ++;
                    }
                }
            }
        }
        // print answer:
		System.out.println(cnt);
		scnr.close();
	}
}