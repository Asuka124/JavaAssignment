package hz222bp_assign3.count_words;

import java.util.Iterator;

/*Assignment 3; Exercise 6
 *Hailing Zhang(hz222bp) 
 *2018-02-24*/
public class TreeWordSet implements WordSet {
	private Node root = null;
	private int size;
	private int count;
	private StringBuilder str = new StringBuilder();

	private Word[] arr = new Word[8];

	private class Node {
		Word word;
		Node left;
		Node right;

		public Node(Word w) {
			word = w;
		}

		public void add(Word w) {
			if (w.compareTo(word) < 0) {
				if (left == null) {
					left = new Node(w);
				} else
					left.add(w);
			}

			else if (w.compareTo(word) > 0) {
				if (right == null) {
					right = new Node(w);
				} else
					right.add(w);
			}
		}

		public boolean contains(Word w) {
			if (w.compareTo(word) == 0) {
				return true;
			} else if ((w.compareTo(word) < 0) && (left != null) && (left.contains(w))) {
				return true;
			} else if ((w.compareTo(word) > 0) && (right != null) && (right.contains(w))) {
				return true;
			} else {
				return false;
			}
		}

		private Word[] getWordArray() {
			if (left != null)
				left.getWordArray();

			if (count == arr.length)
				resize();
			arr[count] = word;
			count++;
			if (right != null)
				right.getWordArray();

			return arr;
		}

		public String toString() {
			if (left != null) {
				left.toString();
			}
			str.append(word + ", ");

			if (right != null) {
				right.toString();
			}
			return str.toString();
		}
	}

	private void resize() {
		Word[] temp = new Word[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public TreeWordSet() {
		size = 0;
	}

	@Override
	public Iterator iterator() {
		return new TreeIterator();
	}

	private class TreeIterator implements Iterator<Word> {
		private int count = 0;

		public TreeIterator() {
			root.getWordArray();
		}

		@Override
		public boolean hasNext() {
			if (root == null) {
				return false;
			} else if (arr[count] == null) {
				return false;

			} else {
				return count < arr.length;
			}
		}

		@Override
		public Word next() {
			return arr[count++];
		}
	}

	@Override
	public void add(Word word) {
		if (contains(word)) { //it is in the set
			return;
		}
		if (root == null) {//the set is empty
			root = new Node(word);
			size = 1;
		} else {
			root.add(word);//otherwise
			size++;
		}
	}

	@Override
	public boolean contains(Word word) {
		if (size == 0) {// Empty set
			return false;
		} else {
			return root.contains(word);
		}
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		if (root != null)
			return "[ " + root.toString() + " ]";
		else
			return "[ ]";
	}
}
