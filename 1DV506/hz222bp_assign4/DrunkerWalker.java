package hz222bp_assign4;

import java.text.DecimalFormat;
/*Assignment 4; Exercise 5
 *Hailing Zhang(hz222bp) 
 *2018-01-04*/
import java.util.*;

public class DrunkerWalker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		System.out.print("Enter the number of steps: ");
		int steps = sc.nextInt();
		System.out.print("Enter the number of walks: ");
		int walks = sc.nextInt();
		sc.close();

		double out = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		// walk the people
		for (int i = 1; i <= walks; i++) {
			RandomWalk rw = new RandomWalk(steps, size);
			while (rw.moreSteps()) {
				rw.takeStep();
				if (rw.inBounds() != true) {
					out++;
					break;
				}
			}
		}
		// Calculate the probability
		double p = (out / walks) * 100;
		System.out.println("Out of " + walks + " drunk people, " + Math.round(out) + " (" + df.format(p)
				+ "% )fell into the water.");
	}
}
