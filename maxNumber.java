import java.util.Random;

public class maxNumber {

    public static void main(String[] args) {

        Random randGen = new Random();

        int num1 = randGen.nextInt(101);
        int num2 = randGen.nextInt(101);
        int num3 = randGen.nextInt(101);

        System.out.println("The three random numbers are: " + num1 + ", " + num2 + ", and " + num3);

        if (num1 > num2)  {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
    }

}
