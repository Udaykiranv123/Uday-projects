
package app;

import java.util.*;

public class List_Games_MostFunFirst {
    public static void main(String[] args) {
        java.util.PriorityQueue<String> games = new java.util.PriorityQueue<>(Collections.reverseOrder());
        games.add("FreeFire");
        games.add("PUBG");
        games.add("COD");
        games.add("Among Us");

        System.out.println("List of Games : "); 
        while (!games.isEmpty()) {
            System.out.println(games.poll());
        }
    }
}
