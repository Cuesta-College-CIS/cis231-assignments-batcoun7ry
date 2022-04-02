/*
3.30 Determine the quadrant number in coordinate plane

Show the quadrant number in which coordinate (x,y) belongs.

Take the user input for the coordinates (x,y)

x and y should be [-100, 100] if x or y is out of range, print 0 Print the
quadrant number Run Example 1

1 10

1

Run Example 2

-1 -20

3

Run Example 3

1 -10

4

Run Example 4

150 -150

0

Figure
*/

import java.util.Scanner;

public class lab330 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int x = scnr.nextInt();
      int y = scnr.nextInt();
      
      if ((x < -100 || x > 100) || (y < -100 || y > 100)) {
         System.out.println(0);
         System.exit(0);
      }
      
      if (x > 0) {
         if (y > 0) {
            System.out.println(1);
         } else {
            System.out.println(4);
         }
      } else {
         if (y > 0) {
            System.out.println(2);
         } else {
            System.out.println(3);
         }
      }
      scnr.close();
   }
}