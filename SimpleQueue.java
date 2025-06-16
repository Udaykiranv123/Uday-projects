
package xyz;

import java.util.Queue;
import java.util.LinkedList;
public class SimpleQueue {
	public static void main(String [] args)
	{
		Queue<String> students= new LinkedList<String>();
		
		students.add("stuent 1");
		students.add("stuent 2");
		students.add("stuent 3");
		
		System.out.println(students);
		String firstOut=students.poll();
		System.out.println(firstOut);
		System.out.println(students);
		
		
	}
}
