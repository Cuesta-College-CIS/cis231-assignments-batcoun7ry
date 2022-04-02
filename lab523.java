/*
5.23 LAB: Find the substring in String Array:

Write a program that reads a list of inputs.

The first word will be used as a keyword, and then the second input is an
integer indicating the number of words that follow. The rest of the list is the
target string. For example, the input is

Java 7 CIS231 Fundamentals of Computer Science: Java programming In this input,
the first “Java” is the keyword. “7” means that there are 7 more words for
input. The program should check the the rest of the string includes the keyword
string “Java” or not.

The output is

True Assumption The number of words in input string is not greater than 20. Hint
Use the String array and String class method For String comparison, .equals( )
*/
import java.util.Scanner;

public class lab523 {
    public static void main(String[] args) {
		int flag = 0;
		final int N = 20;
		String[] words = new String[N];

		Scanner scnr = new Scanner(System.in);
		String key = scnr.next();
		int cnt = scnr.nextInt();
		for (int i = 0; i < cnt; i++) {
			words[i] = scnr.next();
		}
		
		for (int i = 0; i < cnt; i++) {
            if (key.equals(words[i])) {
                flag = 1;
                break;
            }
        }

	   if (flag == 1)
			System.out.println(true);
		else
		   System.out.println(false);

    }
}