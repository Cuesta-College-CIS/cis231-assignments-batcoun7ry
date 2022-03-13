import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float[] userValues = new float[20]; // List of integers from input
		int numValues = scnr.nextInt();
		float denominator = 0;

		for (int i = 0; i < numValues; i++) {
			userValues[i] = scnr.nextFloat();
			// if (userValues[i] > denominator) {
			// when all the inputs are less than 0, the denominator could be 0
			// Thus, it should be initialized with the first input.
			if ((i == 0) || (userValues[i] > denominator)) {
				denominator = userValues[i];
			}
		}

		for (int i = 0; i < numValues; i++) {
			userValues[i] = userValues[i] / denominator;
			System.out.printf("%.2f ", userValues[i]);
		}
		System.out.print("\n");
	}
}