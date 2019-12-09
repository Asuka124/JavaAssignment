package Assignment1;

public class MyIntegerBST implements A1Tree {
	
	// The root element
	private Node root;
	
	public MyIntegerBST() {
		this.root = null;
	}
	
	/*
	 * Insert an element
	 * @params	Integer value	the value of the element
	 * */
	public void insert(Integer value) {
		if(root==null) {
			root = new Node(value);
		} else {
			root.insert(value);
		}
	}
	
	/*
	 * Find the most similar value
	 * @params	Integer value	the target value
	 * @return	Integer	the most similar value of the target value
	 * */
	public Integer mostSimilarValue(Integer value) {
		Node _root = root;
		if(_root==null) throw new IllegalStateException("No element in the tree.");
		int min = Integer.MAX_VALUE;
		int similar = value;
		while(true) {
			if(value==_root.value) {	// Equal is the most similar
				similar = value;
				break;
			}
			if(Math.abs(value-_root.value)<min) {	// the more smaller value, the more similar
				min = Math.abs(value-_root.value);
				similar = _root.value;
			}
			if(value<_root.value) {
				if(_root.left==null) break;
				_root = _root.left;
			} else {
				if(_root.right==null) break;
				_root = _root.right;
			}
		}
		return similar;
	}
	
	/*
	 * Pring all the values order by levels
	 * */
	public void printByLevels() {
		if(root==null) throw new IllegalStateException("No element in the tree.");
		Node _root = root;
		String res = recursion(_root, "");
		res = res.replaceAll("###[0-9]+###", "");
		res = res.substring(0, res.length()-1);
		System.out.println(res);
	}
	
	/*
	 * The recursion of the printByLevels
	 * */
	private String recursion(Node node, String str) {
		if(node==null) return str;
		int depth = node.depth;
		if(str.indexOf("Depth "+depth)==-1) str += "Depth " + depth + ":###"+depth+"###\n";		// If no Depth, add the depth
		str = str.replace("###"+depth+"###", " "+node.value+"###"+depth+"###");					// Add the value of this depth
		str = recursion(node.left, str);
		str = recursion(node.right, str);
		return str;
	}
	
	private class Node {
		public int value;
		public int depth;
		public Node left;
		public Node right;
		
		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
			this.depth = 0;
		}
		
		public void insert(int value) {
			if(value<this.value) {
				if(left==null) {
					left = new Node(value);
					left.depth = this.depth + 1;
				} else {
					left.insert(value);
				}
			} else {
				if(right==null) {
					right = new Node(value);
					right.depth = this.depth + 1;
				} else {
					right.insert(value);
				}
			}
		}
	}
	
}
