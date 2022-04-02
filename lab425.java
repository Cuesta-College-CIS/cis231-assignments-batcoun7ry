/*
4.25 LAB: Count the alphabet characters in the input string

Write a program that counts the number of alphabet 'a' - 'z' and 'A' - 'Z' in
the input string, and find the greatest character in the string
lexicographically. This program will take a string value as input and outputs
the number of alphabet character and the greatest character in the string.

In this program, we do not care about the upper and lower case character. Thus,
'a' is the same as 'A', but 'a' is less than 'B'. We count all duplicated
alphabets respectively. (eg, aaa = 3 ) If the input string does not include any
alphabet, the largest character will be ' '. (space character) char max_char = '
'; Output the counts followed by a tab and the largest character followed by new
line, which can be achieved as follows: System.out.printf("%d\t%c\n", cnt,
Character.toUpperCase(max_char)); // When you print a largest character, use
'toUpperCase( )' to print it as an upper case letter.

Ex: When the input is:

john@company123xyz.net the output is:

17    Z Explanation: 17 alphabets are used in this string. The greatest
character is 'z'. We printed it as an Upper Case letter. Ex: When the input is:

123(){} <> the output is:

0    
Explanation: After printing 0 followed by '\t', we printed the space character '
' as a greatest character
*/

import java.util.Scanner; 

public class lab425 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int charCount = 0;
		int maxChar = 0;

      String inputWord = scnr.nextLine();
      //System.out.println("input word is: " + inputWord + "; Length: " + inputWord.length()); // for debugging

      for (int i = 0; i < inputWord.length(); i++) {
         if (Character.isLetter(inputWord.charAt(i))) {
            charCount ++;
            if ((int)inputWord.charAt(i) > maxChar) {
               maxChar = (int)inputWord.charAt(i);
            }
            //System.out.println("Character: " + inputWord.charAt(i) + " has value: " + (int)inputWord.charAt(i) + "; maxChar = " + maxChar); // for debigging
            }
        }
        if (maxChar == 0) {
            System.out.printf(maxChar + "\t" + " " + "\n");
        } else {
           System.out.printf("%d\t%c\n", charCount, Character.toUpperCase(maxChar));
        }
   }
}