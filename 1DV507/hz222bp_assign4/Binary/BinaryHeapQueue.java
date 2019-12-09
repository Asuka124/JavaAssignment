package hz222bp_assign4.Binary;

import java.util.Iterator;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2018-15-03*/
public class BinaryHeapQueue implements PriorityQueue {
	private Task[] task;// The heap array
	private int size;// Number of elements in heap

	// Construct the binary heap.
	public BinaryHeapQueue() {
		task = new Task[8];
		size = 1;
	}

	@Override
	public void insert(Task t) {
		if (size == 1) {
			task[1] = t;// I am not sure if I should throw exception
			size++;
		} else if (size > 1) {
			if (size == task.length)
				resize();
			task[size++] = t;
		}
		int index = size - 1;
		check(index);
	}

	//resize when the queue is full
	private void resize() {
		Task[] temp = new Task[task.length * 2];
		for (int i = 1; i < size; i++) {
			temp[i] = task[i];
		}
		task = temp;
	}

	private void check(int n) {  //Recursion for checking the task
		if (n == 1) {
			return;
		} else if (task[n].getPriority() <= task[n / 2].getPriority())
			return;
		else {
			int pos = n;
			Task temp = task[n / 2];
			int index = n / 2;
			task[index] = task[n];
			task[pos] = temp;
			check(index);
		}
	}
	
	//Return the task with the highest priority without changing
	@Override
	public Task peekHighest() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Empty queue");
		}
		return task[1];
	}
	
	@Override
	public Task pullHighest() {
		Task root; //Remove the task with the highest priority
		if (isEmpty()) {
			throw new IllegalArgumentException("Queue is Empty");
		} else if (size() == 1) {
			root = task[1];
			task[1] = task[0];
			size--;
		} else {
			root = task[1];
			task[1] = task[size - 1];
			adjust();
			size--;
		}
		return root;
	}

	//Percolate down
	private void adjust() {
		int currentSize = size - 1;
		Task temp = task[currentSize--];
		int up = 1;
		int down = 2;

		while (down <= currentSize) {
			if (down < currentSize && task[down].getPriority() < task[down + 1].getPriority())
				down++;
			if (temp.getPriority() >= task[down].getPriority())
				break;
			task[up] = task[down];
			up = down;
			down *= 2;
		}
		task[up] = temp;
	}

	//Return true if the task were in the queue
	@Override
	public boolean contains(Task t) {
		for (int i = 1; i < size; i++) {
			if (task[i] == t) {
				return true;
			}
		}
		return false;
	}

	//The number of elements in the queue
	@Override
	public int size() {
		return size - 1;
	}

	//Return true if the queue were empty
	@Override
	public boolean isEmpty() {
		return size == 1;
	}

	@Override
	public Iterator<Task> iterator() {
		return new TaskIterator();
	}

	private class TaskIterator implements Iterator<Task> {
		private int count = 1;

		@Override
		public boolean hasNext() {
			return count < size;
		}

		@Override
		public Task next() {
			if (!hasNext()) {
				throw new IllegalArgumentException("Queue is empty");
			}
			return task[count++];
		}
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		for (int i = 1; i <= size(); i++) {
			str.append(task[i] + " ");
		}
		str.append("]");
		return str.toString();
	}
}
