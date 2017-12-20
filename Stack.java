/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {
	private String[] stack;

	// Set up the basic elements of your data structure here.
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	public Stack(int size) {
		stack = new String[size];
		for(int i = 0; i < size; i++) {
			stack[i] = null;
		}
		
	}

	public boolean push(String record) {
		int i = 0;
		if(stack[stack.length - 1] != null) {
			return false;
		} else {
			while(stack[i] != null) {
				i++;
			}
			stack[i] = record;
			return true;
		}
	}

	public String pop() {
		int i = 0;
		while(stack[i+1] != null) {
			if(i < stack.length - 1) {
				i++;
			} else if(i + 1 == stack.length - 2) {
				
			}
		}
		String ret = stack[i];
		stack[i] = null;
		return ret;
	}

	public void printStack() {
		for(int i = stack.length - 1; i > -1; i--) {
			System.out.println(stack[i]);
		}
	}
	
	/*
	 * Implement the other methods specified
	 * in the interface below.
	 */
	
}
