package hz222bp_assign4.Binary;

import java.util.Iterator;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2018-17-03*/
public class WorkMain {
	public static void main(String[] args) {
		PriorityQueue alive = new BinaryHeapQueue();
		System.out.println("Is the queue empty?: " + alive.isEmpty());
		System.out.println("Size: " + alive.size());

		System.out.println();
		Task test = new WorkTask(1, "coffee");
		Task test1 = new WorkTask(1, "coffee");
		Task test2 = new WorkTask(1, "cofefee");
		System.out.println("is" + test.toString() + "equal to " + test1.toString() + "? " + test.equals(test1));
		System.out.println("is" + test1.toString() + "equal to " + test2.toString() + "? " + test.equals(test2));

		System.out.println();
		alive.insert(test);
		System.out.println(test.toString() + "is in the queue? " + alive.contains(test));
		System.out.println("The highest task: " + alive.peekHighest());
		System.out.println("Pull the highest task: " + alive.pullHighest());
		System.out.println(test.toString() + "is in the queue? " + alive.contains(test));

		System.out.println();
		String[] task = { "keep alive", "friends", "money", "work", "residence", "health" };
		for (int i = 1; i < 7; i++) {
			Task t = new WorkTask(i, task[i - 1]);
			alive.insert(t);
		}
		System.out.println(alive.toString());
		System.out.println("Is the queue empty?: " + alive.isEmpty());
		System.out.println("Size: " + alive.size());

		System.out.println("\nTask Iterator");
		Iterator<Task> it = alive.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
