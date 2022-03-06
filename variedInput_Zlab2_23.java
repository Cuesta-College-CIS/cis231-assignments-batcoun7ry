import java.util.Scanner;

public class variedInput_Zlab2_23 {
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

    }   scnr.close();
}