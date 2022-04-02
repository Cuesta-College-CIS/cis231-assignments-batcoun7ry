/*
4.21 Lab: Print numbers in descending order

We will print numbers from n to 0 in descending order. The n is the integer
value between 0 to 100 and will be input from the user. All printed numbers are
separated by a single space. In this lab, you are required to use the 'for loop'
structure.

Run Example 1 10 10 9 8 7 6 5 4 3 2 1 0 Run Example 2 5 5 4 3 2 1 0 Run Example
3 3 3 2 1 0
*/


import java.util.Scanner;

public class lab421{
 
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();  // n : user input
      int i = 0;
      
      while (n > i -1) {
         System.out.print(n + " ");
         n --;
      }
   }
}