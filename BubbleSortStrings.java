package dsa;

import java.util.Scanner;

public class BubbleSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] arr = new String[n];

        // Input: strings
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output: sorted strings
        System.out.println("Strings sorted in alphabetical order:");
        for (String str : arr) {
            System.out.println(str);
        }

        scanner.close();
    }
}
