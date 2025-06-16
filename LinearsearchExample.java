
package xyz;

public class LinearsearchExample {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 7, 8, 4, 5};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found");
        }
    }
}
