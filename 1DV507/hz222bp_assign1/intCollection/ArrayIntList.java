package hz222bp_assign1.intCollection;

/*Assignment 1; Exercise 1
 *Hailing Zhang(hz222bp) 
 *2017-01-17*/
public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	// add an element
	public void add(int n) {
		if (this.size == this.values.length) {
			super.resize();
		} else {
			this.values[this.size++] = n;
		}
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		super.checkIndex(index, this.size);
		this.values[index] = n;
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		super.checkIndex(index, this.size);

		for (int i = index; i < this.size - 1; i++) {
			this.values[i] = this.values[i + 1];
			this.values[this.size - 1] = 0;
			this.size--;
		}
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		super.checkIndex(index, this.size);
		return this.values[index];
	}

	@Override
	public int indexOf(int n) {
		return this.values[n];
	}
}
