/*
3.31 Print the score range according to the grade.

Print the score range of the input grade.

Requirement

Use the switch statement Input

one character for grade should be in 'a', ‘A’, 'b', ‘B’, 'c', ‘C’, 'd', ‘D’,
'f', ‘F’ Output

one of the following according to the grade

      For the grade A: System.out.println(“The score range is 90 ~ 100”);
      For the grade B: System.out.println(“The score range is 80 ~ 89”);
      For the grade C: System.out.println(“The score range is 70 ~ 79”);
      For the grade D: System.out.println(“The score range is 60 ~ 69”);
      For the grade F: System.out.println(“The score range is 0 ~ 59”);
Run Example 1

A

The score range is 90 ~ 100

Run Example 2

b

The score range is 80 ~ 89

Run Example 3

F

The score range is 0 ~ 59

*/


import java.util.Scanner;

public class lab331 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char c =  scnr.next().charAt(0);
      
      switch(c) {
         case 'a':
            System.out.println("The score range is 90 ~ 100");
            break;
         case 'A':
            System.out.println("The score range is 90 ~ 100");
            break;
         case 'b':
            System.out.println("The score range is 80 ~ 89");
            break;
         case 'B':
            System.out.println("The score range is 80 ~ 89");
            break;
         case 'c':
            System.out.println("The score range is 70 ~ 79");
            break;
         case 'C':
            System.out.println("The score range is 70 ~ 79");
            break;
         case 'd':
            System.out.println("The score range is 60 ~ 69");
            break;
         case 'D':
            System.out.println("The score range is 60 ~ 69");
            break;   
         case 'f':
            System.out.println("The score range is 0 ~ 59");
            break;
         case 'F':
            System.out.println("The score range is 0 ~ 59");
            break;
      }   
   }
}