/*
How many x's will be output?:

i = 1;
while (i <= 3) {
   j = 1;
   while (j <= i) {
      System.out.print("x");
      ++j;
   }
   System.out.println();
   ++i;
}*/

public class q1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= i) {
                System.out.print("x");
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}