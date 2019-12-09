package hz222bp_assign4;

/*Assignment 4; Exercise 5
 *Hailing Zhang(hz222bp) 
 *2017-01-04*/
import java.util.*;

public class RandomWalk {
	private int x, y;
	private int max, size;
	private int takenSteps = 0;

	public RandomWalk(int max, int size) {
		this.max = max;
		this.size = size;
		x = 0;
		y = 0;
	}

	public String toString() {
		String str = "The taken steps: " + takenSteps + "\n" + "The current position: " + " (" + x + "," + y + ")";
		return str;
	}

	public void takeStep() {
		Random rd = new Random();
		int rs = rd.nextInt(4);
		switch (rs) {
		case 0:
			x--;
			break;
		case 1:
			y--;
			break;
		case 2:
			x++;
			break;
		case 3:
			y++;
			break;
		}
		takenSteps++;
	}

	public boolean moreSteps() {
		if (takenSteps < max) {
			return true;
		} else {
			return false;
		}
	}

	public boolean inBounds() {
		if ((Math.abs(x) < size) && (Math.abs(y) < size)) {
			return true;
		} else {
			return false;
		}
	}

	public void walk() {
		while (moreSteps() && inBounds()) {
			takeStep();
		}
	}
}