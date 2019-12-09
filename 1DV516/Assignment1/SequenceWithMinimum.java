package Assignment1;

public class SequenceWithMinimum implements A1SequenceWithMinimum {
	
	// The first element (head)
	private Node first;
	
	// The last element (tail)
	private Node last;
	
	public SequenceWithMinimum() {
		this.first = null;
		this.last = null;
	}
	
	/*
	 * Insert element to the last one
	 * @params	Integer value	the value of the element
	 * */
	public void insertRight(Integer value) {
		Node node = new Node(value);
		if(first==null) {
			first = node;
		} else if(last==null) {
			last = node;
			first.right = last;
			last.left = first;
		} else {
			last.right = node;
			node.left = last;
			last = last.right;
		}
	}
	
	/*
	 * Remove the last element
	 * @return	Integer	the value of the last element
	 * */ 
	public Integer removeRight() {
		int res = 0;
		if(first==null) {
			throw new IllegalStateException("No element in the tree.");
		} else if(last==null) {
			res = first.value;
			first = null;
		} else {
			res = last.value;
			last = last.left;
			last.right = null;
		}
		return res;
	}
	
	/*
	 * Insert the element to the first one
	 * @params	Integer value	the value of the element
	 * */ 
	public void insertLeft(Integer value) {
		Node node = new Node(value);
		if(first==null) {
			first = node;
		} else if(last==null) {
			first.right = node;
			node.left = first;
			last = node;
		} else {
			node.right = first;
			first = node;
		}
	}
	
	/*
	 * Remove the first element
	 * @return	Integer	the value of the first element
	 * */
	public Integer removeLeft() {
		int res = 0;
		if(first==null) {
			throw new IllegalStateException("No element in the tree.");
		} else if(last==null) {
			res = first.value;
			first = null;
		} else {
			res = first.value;
			first = first.right;
			first.left = null;
		}
		return res;
	}
	
	/*
	 * Find the minimum value of the sequence
	 * @return	Integer	the minimum value of the sequence
	 * */
	public Integer findMinimum() {
		if(first==null) throw new IllegalStateException("No element in the tree."); 
		int res = Integer.MAX_VALUE;
		Node node = first;
		while(node!=null) {
			if(node.value<res) res = node.value;
			node = node.right;
		}
		return res;
	}
	
	/*
	 * The string format of the sequence
	 * @return String	the json string of the sequence
	 * */
	public String toString() {
		if(first==null) return "{}";
		Node node = first;
		String res = "{";
		while(node!=null) {
			res += node.value + ",";
			node = node.right;
		}
		res = res.substring(0, res.length()-1) + "}";
		return res;
	}
	
	private class Node {
		public int value;
		public Node left;
		public Node right;
		
		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	
}
