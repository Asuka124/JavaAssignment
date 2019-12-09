package hz222bp_assign2;

/*Assignment 2; Exercise 6
 *Hailing Zhang(hz222bp) 
 *2017-11-11*/
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Provide 10 integers: ");

		int max, sec;
		max = sec = 0;

		for (int i = 0; i < 10; i++) {
			int tmp = sc.nextInt();
			if (tmp > max) {
				sec = max;
				max = tmp;
			}
			if (tmp < max && tmp > sec) {
				sec = tmp;
			}
		}
		System.out.println("The second Largest is: " + sec);
		sc.close();
	}
}