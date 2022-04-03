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
        minval = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minval) {
                minval = numbers[i];
            }
        }

        //print minval for debugging:
        System.out.println(minval);

        //close scanner:
		scnr.close();
	}
}

