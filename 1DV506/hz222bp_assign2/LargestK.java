package hz222bp_assign2;

/*Assignment 2; Exercise 3
 *Hailing Zhang (hz222bp)
 *2017-11-11*/
import java.util.Scanner;

public class LargestK {
	public static void main(String[] args) {

		System.out.print("Give a positive integer: ");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		if (p <= 0) {
			System.out.println("Please input a positive integer.");
		} else {
			int K = 0;
			int sum = 0;
			for (int i = 0; i < p; i += 2) {
				sum += i;
				if (sum < p) {
					K = i;
				} else {
					break;
				}
			}
			System.out.println("The largest K such that 0+2+4+6+...+K < " + p + " => " + K);
			sc.close();
		}

	}
}