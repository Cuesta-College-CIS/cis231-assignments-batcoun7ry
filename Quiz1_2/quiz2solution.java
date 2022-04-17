
import java.util.Arrays;
import java.util.Scanner;

public class quiz2solution {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int L = 3;
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();

		int[] result = new int[N];
		for (int i = 0; i < N; i++)
			result[i] = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				result[i] += matrix1[rowidx][j] * matrix2[j][i];
			}
		}

		System.out.println(Arrays.toString(result));

	}

}
