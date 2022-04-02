/*
Assignment 3-3: Print three numbers in ascending order:

Print three random numbers in ascending order. To generate random numbers, use
the Class java.util.Random Random numbers should be between 0 and 100 Print all
three random numbers in ascending order do not use array or any standard
libraries. Use only if statements. Run Example The generated random numbers: 10,
97, 45 Sorted order: 10 45 97 Submit your program in Github Classroom Submit
your flow chart and elaboration on your algorithm in Canvas use the online
flowchart tool https://draw.io 
*/

import java.util.Random;

public class assignment33 {

    public static void main(String[] args) {

        Random randGen = new Random();

        int num1 = randGen.nextInt(101);
        int num2 = randGen.nextInt(101);
        int num3 = randGen.nextInt(101);

        System.out.println("The three random numbers are: " + num1 + ", " + num2 + ", and " + num3);

        if (num1 < num2)  {
            if (num1 < num3) {
                if (num2 < num3) {
                    System.out.println("The sequence is: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("The sequence is: " + num1 + ", " + num3 + ", " + num2);
                }
            } else {
                System.out.println("The sequence is: " + num3 + ", " + num1 + ", " + num2);
            }
        } else {
            if (num2 < num3) {
                if (num1 < num3) {
                    System.out.println("The sequence is: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("The sequence is: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                System.out.println("The sequence is: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }

}