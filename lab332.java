/*
3.32 String Management: Email Validation

Email validation program

Take the user input for the email string Print True if the email string is
validated. Otherwise print False Validate Condition

The email string length is greater than 5 and less than 30

It must include the letter ‘@’

It must include at least one ‘.’ after ‘@’

Hint : get substring from ‘@’ to the end of original string and then check that
it contains ‘.’ int idx = email.indexOf("@"); email.substring(idx,
email.length() -1); It must start with the alphabet character ( ‘a~z’, ‘A~z’)

Recommend to use the string methods

contains(), charAt(), substring(), length() Input

Email string Output

True or false Run Example

John@company.com True 2sam@com.net False Sam.John.net False
*/

import java.util.Scanner;

public class lab332 {
   public static void main (String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String email = scnr.next();
      
      char c = email.charAt(0);
      
      if(Character.isLetter(c)) {
      
      if ((email.contains("@") && ((email.length()) > 5 && email.length() < 30))) {
         int idx = email.indexOf("@");
         if (email.substring(idx, email.length()-1).contains(".")) {
            System.out.println("True");
         } else {
            System.out.println("False");
         }
      } else {
         System.out.println("False");
      }
      } else {
         System.out.println("False");
      }
    }
}
   
