/*
5.25 LAB: The summation of each row in a two-dimensional Array:

In this program we will use two dimensional array N x M, which is the number of
rows and columns, respectively. Input begins with the number of rows N and the
number of columns M followed by N x M integer values. For example, The input is

5 3 1 3 5 6 0 2 4 9 8 0 2 1 6 1 8 We should construct 2-dimensional array as
below:

[1, 3, 5] [6, 0, 2] [4, 9, 8] [0, 2, 1] [6, 1, 8] This program calculates the
summation of each row and column, and then

Print all elements in the row that has the least summation Print all elements in
the row that has the greatest summation Print all elements in the column that
has the least summation Print all elements in the column that has the greatest
summation The output is

0 2 1 4 9 8 3 0 9 2 1 5 2 8 1 8 Output format - System.out.print(numbers[i][j] +
" "); // at each the end of line, use - System.out.println();
*/

import java.util.Arrays;
import java.util.Scanner;

public class lab525 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int M = scnr.nextInt();
        int rowMax_idx = 0;
        int rowMin_idx = 0;
        int colMax_idx = 0;
        int colMin_idx = 0;

		int[][] numbers = new int[N][M];

        // populate array with user input:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j ++) {
                numbers [i] [j] = scnr.nextInt();
            }
        }
        
        // print 2-D array for debugging:
		//for (int i = 0; i < N; i++)
		//	System.out.println(Arrays.toString(numbers[i]));
        

        // calculate rowMax_idx & rowMin_idx:
        int rowMax = 0;
        int rowMin = 0;
        for (int i = 0; i < N; i ++) {
            int rowSum = 0;
            for (int j = 0; j < M; j ++) {
                rowSum += numbers[i] [j];
            }
            if ( (i == 0) || (rowSum > rowMax) ) {
                rowMax = rowSum;
                rowMax_idx = i;
            }
            if ( ( i == 0) || (rowSum < rowMin) ) {
                rowMin = rowSum;
                rowMin_idx = i;
            }
        }

        // calculate colMax_idx & colMin_idx:
        int colMax = 0;
        int colMin = 0;
        for (int i = 0; i < M; i ++) {
            int colSum = 0;
            for(int j = 0; j < N; j++) {
                colSum += numbers[j][i];
            }
            if ( ( i == 0) || (colSum > colMax) ) {
                colMax = colSum;
                colMax_idx = i;
            }
            if ( ( i == 0) || (colSum < colMin) ) {
                colMin = colSum;
                colMin_idx = i;
            }
        }
        
        // for debugging:
        //System.out.println("colMax: " + colMax);
        //System.out.println("colMax_idx: " + colMax_idx);
        //System.out.println("colMin: " + colMin);
        //System.out.println("colMin_idx: " + colMin_idx);

        // print row min and max:
        for (int i = 0; i < M; i ++) {
            System.out.print(numbers[rowMin_idx][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < M; i ++) {
            System.out.print(numbers[rowMax_idx][i] + " ");
        }
        System.out.println();

        // print col min and max:
        for (int i = 0; i < N; i ++) {
            System.out.print(numbers[i][colMin_idx] + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i ++) {
            System.out.print(numbers[i][colMax_idx] + " ");
        }
        System.out.println();
	}
}
