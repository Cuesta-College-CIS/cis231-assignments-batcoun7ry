/*
2.22 LAB: Using math methods

Given three floating-point numbers x, y, and z, output x to the power of z, x to
the power of (y to the power of z), the absolute value of y, and the square root
of (xy to the power of z).

Ex: If the input is:

3.6 4.5 2.0 the output is:

12.96 1.841304610218211E11 4.5 16.2
*/

import java.util.Scanner;

public class lab222 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      System.out.println(Math.pow(x, z) + " " + Math.pow(x, Math.pow(y, z)) + " " + Math.abs(y) + " " + Math.sqrt(Math.pow(x*y, z)));
   }
}
