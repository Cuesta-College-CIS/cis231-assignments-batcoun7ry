/*
2.23 LAB: Simple statistics

Part 1

Given 4 integers, output their product and their average, using integer
arithmetic.

Ex: If the input is:

8 10 5 4 the output is:

1600 6 Note: Integer division discards the fraction. Hence the average of 8 10 5
4 is output as 6, not 6.75.

Note: The test cases include four very large input values whose product results
in overflow. You do not need to do anything special, but just observe that the
output does not represent the correct product (in fact, four positive numbers
yield a negative output; wow).

Submit the above for grading. Your program will fail the last test cases (which
is expected), until you complete part 2 below.

Part 2

Also output the product and average, using floating-point arithmetic.

Output each floating-point value with three digits after the decimal point,
which can be achieved as follows: System.out.printf("%.3f", yourValue);

Ex: If the input is 8 10 5 4, the output is:

1600 6 1600.000 6.750 Note that fractions aren't discarded, and that overflow
does not occur for the test case with large values.
*/


import java.util.Scanner;

public class lab223 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        int userInput;
        int runningSum = 0;
        int inputCount = 0;
        int maxNumber = 0;
        int minNumber = 999999999;

        while (true) {
            userInput = scnr.nextInt();
                if (userInput < 0) {
                    break;
                } else {
                    System.out.print("User Input: " + userInput + " "); // for debugging

                    runningSum += userInput ;
                    System.out.print("     Running Sum: " + runningSum); // for debugging

                    inputCount ++ ;
                    System.out.print("     Input Count: " + inputCount); // for debugging
                    
                    if (userInput > maxNumber) {
                        maxNumber = userInput;
                    } System.out.print("     Max Number: " + maxNumber); // for debugging

                    if (userInput < minNumber) {
                        minNumber = userInput;
                    } System.out.print("     Min Number: " + minNumber + ";     New Input: "); // for debugging
                }
        }
        int adjustedSum = runningSum - maxNumber - minNumber;
        double adjustedMean = (double)adjustedSum / ((double)inputCount - 2);
        
        System.out.printf("%d %.2f\n", adjustedSum, adjustedMean); 

    }   //scnr.close();
}