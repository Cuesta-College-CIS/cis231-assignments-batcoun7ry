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
        int numValues = scnr.nextInt();
        String words[] = new String[numValues];
        int freq[] = new int[numValues];

        for (int i = 0; i < numValues; i++) {
            words[i] = scnr.next();
        }

        for (int i = 0; i < numValues; i++){
            int count = 0;
            for (int j = 0; j < numValues; j++) {
                if (words[j] == words[i]) {
                    count++;
                }
            }
            freq[i] = count;
            System.out.println(words[i] + " - " + freq[i]);
        }
    }
}