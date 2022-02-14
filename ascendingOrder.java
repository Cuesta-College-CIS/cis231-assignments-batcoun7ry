import java.util.Random;

public class ascendingOrder {

    public static void main(String[] args) {

        Random randGen = new Random();

        int num1 = randGen.nextInt(101);
        int num2 = randGen.nextInt(101);
        int num3 = randGen.nextInt(101);

        System.out.println("The three random numbers are: " + num1 + ", " + num2 + ", and " + num3);

        if (num1 < num2)  {
            if (num1 < num3) {
                if (num2 < num3) {
                    System.out.println("The sequence is: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("The sequence is: " + num1 + ", " + num3 + ", " + num2);
                }
            } else {
                System.out.println("The sequence is: " + num3 + ", " + num1 + ", " + num2);
            }
        } else {
            if (num2 < num3) {
                if (num1 < num3) {
                    System.out.println("The sequence is: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("The sequence is: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                System.out.println("The sequence is: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }

}