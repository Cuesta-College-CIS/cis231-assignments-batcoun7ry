/*
Write a program that takes any number of integers as input, and outputs the summation of all inputs until it is less than 100. Input could be positive or negative.
We will use the "while - loop" and take a number as input within the loop until the accumulative summation is less than 100. After the while loop, print the summation value and the number of input values.

When the first input is greater than 100, the summation will be 0 and the number of input is 0.
Output the summation followed by a tab and then the number of inputs used in sum followed by newline, which can be achieved as follows:
System.out.printf("%d\t%d\n", sum, cnt);

Ex: When the input is:

1 50 60 80 90
the output is:

51 2
Explanation: When we take first three inputs 1 + 50 + 60 > 100, thus we stop reading here, and then show the summation of first two.
*/

import java.util.Scanner;

public class sumUnder100_Zlab2_24 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        int userInput;
        int runningSum = 0;
        int inputCount = 0;

        while (true) {
            userInput = scnr.nextInt();
            if (userInput > 98) {
                break;
            } else {
                runningSum += userInput;
                inputCount ++;
                if (runningSum > 99) {
                    runningSum -= userInput;
                    inputCount --;
                    System.out.printf("%d\t%d\n", runningSum, inputCount);
                    System.out.printf("%d\t%d\n", runningSum, inputCount);
                    break;
                }
            System.out.print("User Input: " + userInput + "     ");
            System.out.print("Running Sum: " + runningSum + "     ");
            System.out.print("Input Count: " + inputCount + "     ;Next Input:");
            }
        }
    }
}