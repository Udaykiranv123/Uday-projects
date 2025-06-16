package xyz;

public class SmallNum_from_queue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> minheap = new java.util.PriorityQueue<>();
        minheap.add(5);
        minheap.add(2);
        minheap.add(8);

        System.out.print("The smallest Value from list : " + minheap.poll() + " ");
    }
}