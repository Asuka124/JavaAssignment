package hz222bp_assign2;

/*Assignment 2; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-11-11*/
import java.util.Scanner;

public class Backwards {
	public static void main(String[] args) {

		System.out.print("Provide a line of text: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.substring(i, i + 1);
		}
		System.out.println("Backwarks: " + reverse);
		sc.close();
	}
}
