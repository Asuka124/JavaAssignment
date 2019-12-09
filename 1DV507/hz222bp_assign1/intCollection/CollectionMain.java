package hz222bp_assign1.intCollection;
/*
 * Assignment 1; 
 * Exercise 1 Hailing Zhang(hz222bp)
 *  2017-01-17
 */
public class CollectionMain {
	public static void main(String[] args) {
		// Create an arraylist
		ArrayIntList ail = new ArrayIntList();
		ail.add(1);
		ail.add(10);
		ail.add(-1);
		ail.add(16);
		ail.add(6);
		ail.add(18);
		ail.add(100);
		ail.add(-6);
		System.out.println("The initial array list is:" + ail.toString());
		System.out.println("Is the array list empty? " + ail.isEmpty());
		System.out.println("The size of the array list is " + ail.size());
		// ail.addAt(0, 9); //for check exception
		ail.addAt(7, 2);

		ail.remove(1);

		System.out.println("The number at this position is " + ail.get(0));

		System.out.println("The position of this number is " + ail.indexOf(6));
		
		System.out.println();

		// Create the stack
		ArrayIntStack ais = new ArrayIntStack();
		System.out.println("Is the stack empty? " + ais.isEmpty());
		//ais.peek();//for check exception
		ais.push(1);
		ais.push(-6);
		ais.push(9);
		System.out.println("Now the stack is " + ais.toString());

		System.out.println("Is the stack empty? " + ais.isEmpty());

		System.out.println("Pop the top number " + ais.pop());
		System.out.println("The size of the stack is " + ais.size());
		System.out.println("Peek the top number " + ais.peek());
	}
}

