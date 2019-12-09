package hz222bp_assign2;

/*Assignment 2; Exercise 1
 *Hailing Zhang (hz222bp) 
 *2017-11-11*/
import java.util.Scanner;

public class CountA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a line of text: ");

		String str = sc.nextLine();

		String a = "a";
		String A = "A";

		String str1 = str.replace(a, "");
		String str2 = str.replace(A, "");
		int count1 = (int) (str.length() - str1.length()) / a.length();
		int count2 = (int) (str.length() - str2.length()) / A.length();

		System.out.println("Number of 'a': " + count1);
		System.out.println("Number of 'A': " + count2);
		sc.close();
	}
}