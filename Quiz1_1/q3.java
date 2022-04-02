/*
What is the output, if n is 3?

for (int i = 1; i <= n; ++i) {
   int factorial = 1;
   factorial = factorial * i;
   System.out.print(factorial + " ");
}
*/
public class q3 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; ++i) {
            int factorial = 1;
            factorial = factorial * i;
            System.out.print(factorial + " ");
        }
    }
}
