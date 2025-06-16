
package xyz;
import java.util.Stack;

public class UndoStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Write");
        stack.push("Delete");
        stack.push("Insert");

        System.out.println("The last action performed : "+stack.peek());

    }
}
