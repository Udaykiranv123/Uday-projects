
package app;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_task {
    public static void main(String[] args) {
        Queue<String> kids = new LinkedList<>();
        kids.add("Alice");
        kids.add("Usagi");
        kids.add("Chisiya");
        kids.add("Arisu");
        System.out.println("Total no. of kids waiting : "+kids.size());
        System.out.println("Total kids in waiting in queue : "+kids);
        System.out.println("They are taken ice cream in order : ");
        int n = kids.size();
        for(int i=0 ; i<n; i++){
            System.out.println(kids.poll());
        }

    }
}
