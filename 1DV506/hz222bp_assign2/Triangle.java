package hz222bp_assign2;

/*Assignment 2; Exercise 5
 *Hailing Zhang (hz222bp)
 *2017-11-11*/
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.print("Provide an odd positive integer: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();// input

		if (i % 2 == 0 | i <= 0) {
			System.out.print("Please input a odd positive integer.");// return code
		} else {
			System.out.print("Right-Angled Triangle:");

			for (int j = 0; j <= i; j++) {
				for (int a = i; a > 0; a--) {
					if (a <= j) {
						System.out.print("*");
					} else {
						System.out.print(" ");// Right-triangle
					}
				}
				System.out.println();
			}

			System.out.println("Isosceles Triangle:");

			for (int k = 1; k <= (i + 1) / 2; k++) {
				for (int b = (i + 1) / 2; b > k; b--) {
					System.out.print(" ");
				}
				for (int b = 1; b <= 2 * k - 1; b++) {
					System.out.print("*");
				}
				System.out.println();// Isosceles Triangle
				sc.close();
			}
		}
	}
}