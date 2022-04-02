/*
Assignment 3-2: FInd the Max Number:

Find the greatest number among three random numbers. To find the greatest
number, use the if-else if or nested if statements To generate random numbers,
use the Class java.util.Random Random numbers should be between 0 and 100 Print
all three random numbers Print the greatest number Run Example The generated
random number: 10, 97, 45 The greatest number: 97 Submit your program in Github
Classroom Submit your flow chart and elaboration on your algorithm in Canvas use
the online flowchart tool https://draw.io 
*/

import java.util.Random;

public class maxNumber {

    public static void main(String[] args) {

        Random randGen = new Random();

        int num1 = randGen.nextInt(101);
        int num2 = randGen.nextInt(101);
        int num3 = randGen.nextInt(101);

        System.out.println("The three random numbers are: " + num1 + ", " + num2 + ", and " + num3);

        if (num1 > num2)  {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
    }

}
