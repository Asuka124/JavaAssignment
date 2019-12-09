package hz222bp_assign1;

/*
* Distance.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter coordinates of P1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		System.out.println("Enter coordinates of P2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		double d = Math.sqrt(Math.abs((x1 - x2) * (x1 - x2)) + Math.abs((y1 - y2) * (y1 - y2)));
		String distance = String.format("%.3f", d);

		System.out.println("The distance of P1 and P2 is: " + distance);
	}
}

