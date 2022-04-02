/*
4.22 Lab: Print n's power numbers

We will print the sequence of n to power numbers from 0 to p. n is between 2 and
10, p is between 0 and 10.

For example, Let's assume that n = 2, p = 3. We will print from 2 to power
number 0 to 2 to power number 3. 1 2 4 8

Run Example 1 2 3 1 2 4 8 Run Example 2 3 5 1 3 9 27 81 243
*/


import java.util.Scanner;
import java.lang.Math;

public class lab422 {
 
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();  // n : user input
      int p = scnr.nextInt();
      int i = 0;
      
      while (i < p + 1) {
         System.out.print((int)Math.pow(n, (int)i) + " ");
         i ++;
      }
   }
}