package Day9;

import java.util.Stack;

public class List_Stack {
	public static void main(String[] args) {
	        Stack<String> stack = new Stack<>();
	        stack.push("Apple");
	        stack.push("Banana");
	        stack.push("Mango");
	        System.out.println("Stack: " + stack);

	        // Peek (view top element without removing)
	        System.out.println("Top element (peek): " + stack.peek());

	        // Pop (remove top element)
	        System.out.println("Popped element: " + stack.pop());

	        // Display the stack after pop
	        System.out.println("Stack after pop: " + stack);

	        // Search for an element
	        System.out.println("Position of 'Apple': " + stack.search("Apple"));  // 1 = top, -1 = not found

	        // Check if stack is empty
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
}

