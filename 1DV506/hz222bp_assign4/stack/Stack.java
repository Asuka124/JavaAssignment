package hz222bp_assign4.stack;

import java.util.Iterator;

/*Assignment 4; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/
public interface Stack {
	int size(); // Current stack size

	boolean isEmpty(); // true if stack is empty

	void push(Object element); // Add element at top of stack

	Object pop(); // Return and remove top element,
	// exception if stack is empty

	Object peek(); // Return (without removing) top element,
	// exception if stack is empty.

	Iterator<Object> iterator(); // Element iterator
}
