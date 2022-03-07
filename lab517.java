/*
Write a program that reads a list of words. Then, the program outputs those words and their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain fewer than 20 words.

Ex: If the input is:

5 hey hi Mark hi mark
the output is:

hey - 1
hi - 2
Mark - 1
hi - 2
mark - 1
Hint: Use two arrays, one array for the strings and one array for the frequencies.
*/

import java.util.Scanner;

public class lab517 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numValues = scnr.nextInt(); // define number of elements in words array with user int
        String words[] = new String[numValues]; // make words array
        int freq[] = new int[numValues]; // make frequency array that corresponds to words array

        for (int i = 0; i < numValues; i++) { // loop through words array and assign a word to each element with scanner
            words[i] = scnr.next();
        }

        for (int i = 0; i < numValues; i++) { // loop through words array again with nested for loop to count frequency
                                              // of each word
            int count = 0;
            for (int j = 0; j < numValues; j++) { // the nested for loop to count frequency
                // if (words[j] == words[i]) { // this is the code to detect a match. It works
                // only for the first "self" detection (count goes from 0 to 1), but it does not
                // detect other matches for some reason.
                // Instead of == operators, the method of string is better.
                if (words[i].equals(words[j]))
                    count++;
            }
            freq[i] = count;
            // Two lines move down to out of loop
            // freq[i] = count; // back in the outer loop, this updates the frequency array
            // with the count value for each "i" index.
            // System.out.println(words[i] + " - " + freq[i]); // prints the word with its
            // frequency, but all frequencies are "1" for some reaosn.
        }
        for (int i = 0; i < numValues; i++) {
            System.out.println(words[i] + " - " + freq[i]);
        }

    }
}