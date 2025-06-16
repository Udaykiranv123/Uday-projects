
package xyz;


import java.util.Scanner;
import java.util.TreeSet;


// Task 5 - Search function with TreeSet
// Objective: Simulate a search functionality.
// Instructions:
// Create a TreeSet of product names: Keyboard, Mouse, Monitor, CPU, Webcam.
// Ask the user to enter a product name.
// Check if the entered product exists in the set or not.
// Print a message accordingly.

public class SearchTreeSet {
    public static void main(String[] args) {
        TreeSet<String> products = new TreeSet<>();
        products.add("Key board");
        products.add("Mouse");
        products.add("Monitor");
        products.add("CPU");
        products.add("Webcam");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a product name : ");
        String product = sc.nextLine();

        if(products.contains(product)){
            System.out.println("Product already in the products list");
        }else{
            products.add(product);
            System.out.println("Product added successfully!");
        }
        System.out.println(products);
        sc.close();
        
    }
    
}
