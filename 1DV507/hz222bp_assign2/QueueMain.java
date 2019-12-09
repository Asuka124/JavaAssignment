package hz222bp_assign2;

import java.util.Iterator;

/**
 * <h1>QueueMain</h1>
 * 
 * This is a demonstration for check methods of the linkedIntList
 * <p>
 * Assignment 2; Exercise 1; Task 2
 * 
 * @author Hailing Zhang(hz222bp)
 * @version 1.0
 * @since 2018-02-01
 */

public class QueueMain {
	public static void main(String[] args) {
		LinkedQueue lil = new LinkedQueue();
		lil.enqueue(-1);
		lil.enqueue(0);
		lil.enqueue(9);
		lil.enqueue(3);

		System.out.println(lil.toString());// showing the initial list
		System.out.println("Is the list empty? " + lil.isEmpty());// check if the list is empty
		System.out.println("The list has " + lil.size() + " objects.");// the size of list
		System.out.println("The first element in the list: " + lil.first());// first element
		System.out.println("The last element in the list: " + lil.last());// last element

		lil.dequeue();// return and remove first element.

		Iterator<Object> iterator = lil.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}