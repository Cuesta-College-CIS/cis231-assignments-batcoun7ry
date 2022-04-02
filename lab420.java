/*
4.20 Lab: Print numbers in sequence

We will print numbers from 0 to n. The n is the integer value between 0 to 100
and will be input from the user. All printed numbers are separated by a single
space. In this lab, you are required to use the 'while loop' structure.

Run Example 1 10 0 1 2 3 4 5 6 7 8 9 10 Run Example 2 5 0 1 2 3 4 5 Run Example
3 3 0 1 2 3
*/

import java.util.Scanner;

public class lab420{
 
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();  // n : user input
      int i = 0;
      
      while (i < n + 1) {
         System.out.print(i + " ");
         i ++;
      }
   }
}