/*
What is the output?

int x = 18;
while (x > 0) {
   // Output x and a space
   x = x / 3; 
}
*/

public class q10 {
    public static void main(String[] args) {
        int x = 18;
        while (x > 0) {
            System.out.print(x + " ");
            x = x / 3; 
        }
    }
}