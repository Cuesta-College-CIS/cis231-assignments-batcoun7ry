/*
What is the output?

int n;
for (n = 0; n < 10; n = n + 3) {
   System.out.print(n + " ");
}
*/
public class q8 {
    public static void main(String[] args) {
        int num = 10;
        while (num <= 15) {
           System.out.print(num + " ");
           if (num == 12) {
              break;
           }
           ++num; 
        } 
        System.out.print("Done");
    }
}

