package hz222bp_assign3;

/*Assignment 3; Exercise 3 test(Main)
 *Hailing Zhang(hz222bp) 
 *2017-11-30*/
public class MultiDisplayMain {
	// A demonstration for check methods.
	public static void main(String[] args) {
		MultiDisplay md = new MultiDisplay();
		// print out the first sentence
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(3);
		md.display();
		// print out the second sentence
		md.display("Goodbye cruel world!", 2);
		System.out.println("Current Message: " + md.getDisplayMessage());
	}
}
