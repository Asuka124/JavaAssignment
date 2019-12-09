package hz222bp_assign1.intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	@Override
	public void push(int n) {
		if (this.size() == this.values.length) {
			super.resize();
		} else {
			this.values[this.size++] = n;
			System.out.println("Push (" + n + ")");
		}
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		int temp = -1;
		if (isEmpty() == true) {
			throw new IllegalStateException("Empty stack");
		} else {
			try {
				 return values[--size];
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		return temp;
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		int temp = -1;
		if (isEmpty() == true) {
			throw new IllegalStateException("Empty stack");
		} else {
			try {
				temp = this.values[this.size - 1];
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			return temp;
		}
	}
}
