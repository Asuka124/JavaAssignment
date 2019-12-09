package hz222bp_assign4.Binary;

import java.util.Iterator;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2018-14-03*/
public interface PriorityQueue {
	public void insert(Task t); // Add task to the queue

	public Task pullHighest(); // Return and remove highest task

	public Task peekHighest(); // Return highest priority task but not remove

	public boolean contains(Task t); //Return true if the queue contains the task

	public int size(); // Return the number of tasks in the queue

	public boolean isEmpty(); // Return true if the queue were empty
	
	public Iterator<Task> iterator();

	public String toString();
}
