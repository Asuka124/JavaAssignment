package hz222bp_assign4.Binary;

/*Assignment 4; Exercise 5
 *Hailing Zhang(hz222bp) 
 *2018-08-03*/

//This implementation gained help from the introduction of the Binary Heap on Wikipedia

public class BinaryIntHeap {
	private int[] heap;
	private int size;
	private int pos;

	// Constructs an empty heap
	public BinaryIntHeap() {
		heap = new int[10];
		size = 1;
	}

	// Add n to heap
	public void insert(int n) {
		if (isEmpty()) {
			heap[1] = n;
			size++; // Percolate up
		} else if (size > 1) {
			if (size == heap.length) {
				resize();
			}
			heap[size++] = n;
			pos = size - 1;
			check(pos);
		}
	}

	private void resize() {
		int size = (heap.length * 2) - 1;
		int[] temp = new int[size];
		System.arraycopy(heap, 1, temp, 1, heap.length - 1);
		heap = temp;
	}

	// Find the position of the element
	private void check(int a) {
		if (a == 1) {// It is at the first position
			return;
		} else if (heap[a] <= heap[a / 2])// should be smaller than the upper element
			return;
		else {
			int pos = a;
			int temp = heap[a / 2];
			int index = a / 2;
			heap[index] = heap[a];
			heap[pos] = temp;
			check(index);
		}
	}

	// Return and remove element with highest priority
	public int pullHighest() {
		if (size == 1) {
			throw new IllegalArgumentException("Empty heap");
		}
		int highest = heap[1];
		heap[1] = heap[size - 1];
		int[] temp = new int[heap.length];
		for (int i = 0; i < size - 1; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
		size--;
		pos = 1;
		adjust(pos);// Adjust the sequence of the heap after changing
		return highest;
	}

	private void adjust(int index) {
		int n = 1;
		int left = 2 * n;
		while (left < heap.length) {
			int root = left;
			int right = left + 1;
			if (right < heap.length) {
				if (heap[right] > heap[left]) {
					root++;
				}
			}
			if (heap[n] < heap[root]) {
				int temp = heap[n]; // adjust
				heap[n] = heap[root];
				heap[root] = temp;
				n = root;
				left = 2 * n;
			} else
				break;
		}
	}

	// Current heap size
	public int size() {
		return size - 1;// do not
	}

	// True if heap is empty
	public boolean isEmpty() {
		return size == 1;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 1; i < size; i++) {
			if (i == size - 1) {
				str.append(heap[i]);
			} else {
				str.append(heap[i] + ", ");
			}
		}
		return "[" + str.toString() + "]";
	}
}