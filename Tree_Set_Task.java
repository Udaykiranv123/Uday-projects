
package xyz;

import java.util.TreeSet;
public class Tree_Set_Task {
	    public static void main(String[] args) {
	       
	        TreeSet<Integer> set = new TreeSet<>();
	        set.add(1);
	        set.add(2);
	        set.add(3);
	        set.add(4);
	        set.add(5);
	        set.add(6);
	        set.add(6);
	        set.add(7);
	        set.add(7);
	        set.add(7);
	        System.out.println("Unique set : "+ set);

	        System.out.println("First value: "+set.getFirst());
	        System.out.println("Last value: "+set.getLast());

	        TreeSet<String> names = new TreeSet<>();
	        names.add("Mohan");
	        names.add("Ram");
	        names.add("Siva");
	        names.add("Sriram");
	        names.add("kushal");
	        System.out.println("Names in alphabetic order : "+names);
	        System.out.println("Names in reverse alphabetic order : "+names.reversed());
	    }
	}