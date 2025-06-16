
package xyz;
import java.util.Comparator;
import java.util.TreeSet;

// Task 4 - Sort employee names in reverse
// Objective: Use a TreeSet with a custom comparator to sort strings in descending order.
// Instructions:
// Create a TreeSet named employeeNames that stores employee names in reverse alphabetical order.
// Add the following employee names to the TreeSet: "Sumit", "Karan", "Anjali", "Mohan", "Zoya".
// Display the names in reverse order.

public class Sort_Emp_Task {
    public static void main(String[] args) {
        TreeSet<String> enames = new TreeSet<>(Comparator.reverseOrder()); // used custom comparator
        enames.add("Sumit");
        enames.add("Karan");
        enames.add("Anjali");
        enames.add("Mohan");
        enames.add("Zoya");

        System.out.println("Names of employees in order : "+enames); // reversed alphabetic order
        System.out.println("Names of employees in reverse order : "+enames.reversed()); // alphabetic order
    }
}
