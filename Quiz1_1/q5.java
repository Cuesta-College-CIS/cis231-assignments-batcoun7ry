/*
Given that integer array x has elements 4, 7, 3, 0, 8, what are the elements
after the loop?

int i; for (i = 0; i < 4; ++i) { x[i] = x[i + 1];
}
*/
public class q5 {
    public static void main(String[] args) {
        int [] x = new int[]{4,7,3,0,8};
        int i;
        for (i = 0; i < 4; ++i) {
            x[i] = x[i + 1];
            System.out.print(x[i]);
        }
    }
}
