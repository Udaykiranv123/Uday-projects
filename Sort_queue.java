
package xyz;
import java.util.PriorityQueue;

public class Sort_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(5);
        minheap.add(2);
        minheap.add(8);

        System.out.println("Sorted List : ");
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ");
        }
    }
}
