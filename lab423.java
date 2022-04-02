/*
4.23 LAB: Varied amount of input data

Statistics are often calculated with varying amounts of input data.

Write a program that takes any number of non-negative integers as input, and
outputs the summation and average except the min and max value. A negative
integer ends the input and is not included in the statistics. Assume the input
contains at least one non-negative integer.

When the number of input is less than or equal to 2, the summation and average
is 0 and 0.00 respectively. Output the average with two digits after the decimal
point followed by a newline, which can be achieved as follows:
System.out.printf("%.2f\n", average);

Ex: When the input is:

15 20 0 3 -1 the output is:

18 9.00 Explanation: Except 20(max), 0 (min) among 15 20 0 3, sum = 18, average
= 9.00
*/

import java.util.Scanner; 

public class lab423 {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);

        int userInput;
        int runningSum = 0;
        int inputCount = 0;

	   
	   // These initialization will work well. but hope you use the defined const value for min and max, like
	    // int maxNumber = INT.MAX_VALUE;
	    // int minNumber = INT.MIN_VALUE;
// OR
	   // max and min can be initialized with the first input
	   // like,
	   // if userInput is the firstInput
	   // maxNumber = userInput;
	   // minNumber = userInput;

	   
        int maxNumber = 0;
        int minNumber = 999999999;

         while (true) {
            userInput = scnr.nextInt();
               if (userInput < 0) {
                    break;
               } else {
                  //System.out.print("User Input: " + userInput + " "); // for debugging

                  runningSum += userInput ;
                  //System.out.print("     Running Sum: " + runningSum); // for debugging

                  inputCount ++ ;
                  //System.out.print("     Input Count: " + inputCount); // for debugging
                    
                  if (userInput > maxNumber) {
                     maxNumber = userInput;
                  } //System.out.print("     Max Number: " + maxNumber); // for debugging

                  if (userInput < minNumber) {
                     minNumber = userInput;
                  } //System.out.print("     Min Number: " + minNumber + ";     New Input: "); // for debugging
               }
         }
         
         int adjustedSum = runningSum - maxNumber - minNumber;
         double adjustedMean = (double)adjustedSum / ((double)inputCount - 2);
         
         if (inputCount < 3) {
            System.out.println("0 0.00"); // sort of cheating, but instructions say "assume > 1 non neg. int."
         } else {
         System.out.printf("%d %.2f\n", adjustedSum, adjustedMean);
         }
   }
}
