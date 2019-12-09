package hz222bp_assign2;

/*Assignment 2; Exercise 9; VG-exercise
 *Hailing Zhang(hz222bp) 
 *2017-11-13*/
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.print("Provide a line of text: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String str1 = str.toUpperCase();// upper case letter to be equal to the corresponding lower case letter
		String str2 = str1.replaceAll("[^A-Z]", "");// Ignore all characters that are not letters

		String reverse = "";
		for (int i = str2.length() - 1; i >= 0; i--) {
			reverse += str2.substring(i, i + 1);// build a new string for compare
		}

		int count = 0;//
		for (int i = 0; i < str2.length(); i++) {

			if (str2.charAt(i) == reverse.charAt(i)) {
				count++;
			}
		}
		if (count == str2.length()) {
			System.out.println("Yes, it is a palindrome.");
		} else {
			System.out.println("No. It is not the palindrome.");
		}
	}
}