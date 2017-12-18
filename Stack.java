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
	}

	public boolean push(String record) {
		int i = 0;
		if(stack[stack.length - 1].equals("") == false) {
			return false;
		} else {
			while(stack[i].equals("") == false) {
				i++;
			}
			stack[i] = record;
			return true;
		}
	}

	public String pop() {
		int i = 0;
		while(stack[i+1].equals("") == false) {
			i++;
		}
		String ret = stack[i];
		stack[i] = "";
		return ret;
	}

	public void printStack() {
		for(int i = 0; i < stack.length; i++) {
			System.out.print(stack[i]);
		}
	}
	
	/*
	 * Implement the other methods specified
	 * in the interface below.
	 */
	
}