/*
Given that integer array x has elements 5, 10, 15, 20, what is the output?

int i;
for (i = 0; i < 4; ++i) {
   System.out.print(x[i] + x[i + 1]); 
}
*/
public class q6 {
    public static void main(String[] args) {
        int [] x = new int[]{5,10,15,20};
        int i;
        for (i = 0; i < 4; ++i) {
           System.out.print(x[i] + x[i + 1]); 
        }
    }
}

