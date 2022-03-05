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
