package hz222bp_assign3;

/*Assignment 3; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2017-11-30*/
public class MultiDisplay {

	private String message;
	private int count;

	// get string and count
	public void setDisplayMessage(String m1) {
		message = m1;
	}

	public void setDisplayCount(int cn) {
		count = cn;
	}

	public String getDisplayMessage() {
		return message;
	}

	// print out the sentence
	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public void display(String m1, int cn) {
		setDisplayMessage(m1);
		setDisplayCount(cn);
		display();
	}
}

