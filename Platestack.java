
package xyz;
import java.util.Stack;
public class Platestack {
	    public static void main(String[] args) {
	       
	        Stack<Integer> plateStack = new Stack<>();	        
	        plateStack.push(101);
	        plateStack.push(102);
	        plateStack.push(103);
	        plateStack.push(104);
	        plateStack.push(105);
	        System.out.println("Plates stacked: " + plateStack);
	        int usedPlate = plateStack.pop();
	        System.out.println("Plate used: " + usedPlate);

	        System.out.println("Plates left: " + plateStack.size());
	        System.out.println("Current stack: " + plateStack);
	    }
	}

