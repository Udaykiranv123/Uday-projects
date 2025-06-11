package dsa;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");

        // Reverse the order of words
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
