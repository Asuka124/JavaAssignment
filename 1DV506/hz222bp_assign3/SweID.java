package hz222bp_assign3;

import java.util.Scanner;

/*Assignment 3; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-11-29*/
public class SweID {

	// A demonstration for check methods.

	public static void main(String[] args) {
		System.out.print("Please input ID: ");
		Scanner sc = new Scanner(System.in);
		String ID = sc.nextLine();
		System.out.println("The first Part of ID: " + getFirstPart(ID));
		System.out.println("The second Part of ID: " + getSecondPart(ID));
		System.out.println("Does this ID belong to a female? " + isFemaleNumber(ID));
		System.out.println("Does this ID belong to a male? " + isMaleNumber(ID));
		System.out.print("Please input another ID: ");
		String compare = sc.nextLine();
		System.out.println("Are these two IDs same? " + areEqual(ID, compare));
		System.out.println("Is it a corret ID?" + isCorrect(ID));
		sc.close();
	}

	// The first part (YYMMDD) of the identity number
	public static String getFirstPart(String ID) {
		return ID.substring(0, 6);
	}

	// The second part (NNNN) of the identity number
	public static String getSecondPart(String ID) {
		return ID.substring(7, 11);
	}

	// Determine the identity number belongs to a woman or a man
	public static boolean isFemaleNumber(String ID) {
		int n = Integer.parseInt(ID.substring(9, 10));
		if (n % 2 == 0)
			return true;
		return false;
	}

	// Determine the identity number belongs to a woman or a man
	public static boolean isMaleNumber(String ID) {
		int n = Integer.parseInt(ID.substring(9, 10));
		if (n % 2 != 0)
			return true;
		return false;
	}

	// Determine if two IDs are same
	public static boolean areEqual(String ID, String compare) {
		if (ID.equals(compare))
			return true;
		return false;
	}

	// If the number is a correct identity number
	public static boolean isCorrect(String ID) {
		if (ID.length() < 11) {
			System.out.println("It is not a correct ID (unvalid format).");
			return false;
		}
		int y = Integer.parseInt(ID.substring(0, 2));
		int m = Integer.parseInt(ID.substring(2, 4));
		int d = Integer.parseInt(ID.substring(4, 6));

		// check if the year is right
		if (y < 0) {
			System.out.println("It is not a correct ID (unvalid year).");
			return false;
		}
		// check if the day is right
		if (d <= 0) {
			System.out.println("It is not a correct ID (unvalid day).");
			return false;
		}

		// check if month is right
		if (m <= 0 || m > 12) {
			System.out.println("It is not a correct ID (unvalid month).");
			return false;
		}

		// check if the day includes 1-30 or 1-31 in normal years
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if (d > 31) {
				System.out.println("It is not a correct ID (unvalid day).");
				return false;
			}
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (d > 30) {
				System.out.println("It is not a correct ID (unvalid day).");
				return false;
			}
		}

		// Check if it is LeapYear so that there are 29 days in February
		if (m == 2) {
			if (47 <= y && y <= 99 && (y + 1900) % 4 == 0) { // this ID system was used from 1947
				if (d > 29) {
					System.out.println("It is not a correct ID (unvalid day).");
					return false;
				}
			} else if (0 < y && y <= 17 && (y + 2000) % 4 == 0) { // until 2017
				if (d > 29) {
					System.out.println("It is not a correct ID (unvalid day).");
					return false;
				}
			} else if (y == 0) { // 2000 was a leap year and there is just one leap year from 1947 to 2017 that
									// ends with double 0
				if (d > 29) {
					System.out.println("It is not a correct ID (unvalid day).");
					return false;
				}
			}
		}

		// check the last digit
		int l = Integer.parseInt(ID.substring(10, 11));// get the last digit from input string
		int sum = 0;

		// get the right last digit by one by one calculations
		int y1 = Integer.parseInt(ID.substring(0, 1));
		if (y1 * 2 > 9) {
			y1 = (1 + ((y1 * 2) % 10));
		} else {
			y1 = y1 * 2;
		}

		int y2 = Integer.parseInt(ID.substring(1, 2));

		int m1 = Integer.parseInt(ID.substring(2, 3));
		if (m1 * 2 > 9) {
			m1 = (1 + ((m1 * 2) % 10));
		} else {
			m1 = m1 * 2;
		}

		int m2 = Integer.parseInt(ID.substring(3, 4));

		int d1 = Integer.parseInt(ID.substring(4, 5));
		if (d1 * 2 > 9) {
			d1 = (1 + ((d1 * 2) % 10));
		} else {
			d1 = d1 * 2;
		}

		int d2 = Integer.parseInt(ID.substring(5, 6));

		int p1 = Integer.parseInt(ID.substring(7, 8));
		if (p1 * 2 > 9) {
			p1 = (1 + ((p1 * 2) % 10));
		} else {
			p1 = p1 * 2;
		}

		int p2 = Integer.parseInt(ID.substring(8, 9));

		int g = Integer.parseInt(ID.substring(9, 10));
		if (g * 2 > 9) {
			g = (1 + ((g * 2) % 10));
		} else {
			g = g * 2;
		}

		sum = y1 + y2 + m1 + m2 + d1 + d2 + p1 + p2 + g;
		int l1 = (10 - sum % 10);
		if (l != l1) {
			System.out.println("It is not a correct ID (unvalid last digit).");
			return false;
		}
		// the right formula after expecting all faults
		if (Integer.parseInt(ID.substring(9, 10)) % 2 == 0) {
			System.out.println(ID + " is a correct female number.");
		} else {
			System.out.println(ID + " is a correct male number.");
		}
		return true;
	}
}