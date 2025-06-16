package app;
import java.util.*;

public class Queue_Task_IceCreamShop {
    public static void main(String[] args) {

        //Task: simulate an ice cream queue using queue
        // 5 kids are in queue
        // show the first kid
        // remove first kid

        Queue<String> kids = new LinkedList<>();
        kids.add("mohan");
        kids.add("Raghu");
        kids.add("Nanda");
        kids.add("Shakeeb");
        kids.add("shiva");

        System.out.println("Kids in queue : "+kids);
        System.out.println("The first Kid waiting for ice cream is : "+kids.peek());
        kids.poll();
        kids.add("Viswa");
        System.out.println("After first kid gets ice cream.The remaining kids are : "+kids);

    }
}