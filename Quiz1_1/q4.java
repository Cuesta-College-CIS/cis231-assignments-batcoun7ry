/*
What is the ending value of sum, if the input is 2 5 7 3? All variables are integers.

x = scnr.nextInt();
sum = 0;
for (i = 0; i < x; ++i) {
   currValue = scnr.nextInt();
   sum += currValue;
}
*/
import java.util.Scanner; 

public class q4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();
        int sum = 0;
        for (int i = 0; i < x; ++i) {
            int currValue = scnr.nextInt();
            sum += currValue;
        }
        System.out.print(sum);
    }
}

