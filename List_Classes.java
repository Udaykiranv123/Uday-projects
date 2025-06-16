
package app;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class List_Classes {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
    }
}

class Arraylist{
    public Arraylist() {
        System.out.println("This is Arraylist");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
    }
}

class Linkedlist extends Arraylist{
    public Linkedlist() {
        System.out.println("This is Linkedlist");
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
    }
}

class Hashset{
    public Hashset(){
        System.out.println("This is Hashset");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(set);
        }
    }
}

class Hashmap extends Hashset{
    public Hashmap(){
        System.out.println("This is HashMap");
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            for(int j=10; j>0; j--){
                map.put(i,j);
            }
         
        }
        System.out.println(map);
        
    }
    
}
