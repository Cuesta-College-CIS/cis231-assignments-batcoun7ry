import java.util.Scanner; 

public class lab424 {
   public static void main(String[] args) {
 
		Scanner scnr = new Scanner(System.in);

        int userInput;
        int runningSum = 0;
        int inputCount = 0;

        while (true) {
            userInput = scnr.nextInt();
            if (userInput > 98) {
               System.out.printf("%d\t%d\n", runningSum, inputCount);
               break;
				// Why there are two conditions > 98 and > 99 ?
				// Also, if > 98, not taking subtraction and count-- ?
				// When the first input is 99,
				// This loop will stop even the sum is not greater than 100.
			//
			// The below code would be shorter and more compact
		// 	while (true) {
			// 	userInput = scnr.nextInt();
			// 	if (sum + userInput > 100)
			// 		break;
			// 	sum += userInput;
			// 	cnt++;
		// }
				
            } else {
               runningSum += userInput;
               inputCount ++;
               if (runningSum > 99) {
                  runningSum -= userInput;
                  inputCount --;
                  System.out.printf("%d\t%d\n", runningSum, inputCount);
                  break;
               }
            //System.out.print("User Input: " + userInput + "     "); // for debugging
            //System.out.print("Running Sum: " + runningSum + "     "); // for debugging
            //System.out.print("Input Count: " + inputCount + "     ;Next Input:"); // for debugging
            //System.out.printf("%d\t%d\n", runningSum, inputCount); // for debugging

            }
        }
	scnr.close();
    }
}
