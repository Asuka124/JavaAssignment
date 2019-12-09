package hz222bp_assign2;

/*Assignment 2; Exercise 7; VG-exercise
 *Hailing Zhang(hz222bp) 
 *2017-11-12*/
import java.util.Scanner;

public class countDigits {
	public static void main(String[] args) {
		System.out.print("Provide a positive integer:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int l = str.length();

		String Zero = "0";
		String str1 = str.replace(Zero, "");
		int Zeros = (int) (l - str1.length()) / Zero.length();// count the number of zeros

		int Odd, Even;
		Odd = Even = 0;

		for (int i = 0; i < l; i++) {
			String str2 = str.substring(i, i + 1);
			int a = Integer.parseInt(str2);
			if (a % 2 != 0) {
				Odd++;
			} else if (a % 2 == 0 && a != 0) {
				Even++; // count the number of even and odd
			}
		}
		System.out.println("Zeros: " + Zeros);
		System.out.println("Odd: " + Odd);
		System.out.println("Even: " + Even);
		sc.close();
	}
}