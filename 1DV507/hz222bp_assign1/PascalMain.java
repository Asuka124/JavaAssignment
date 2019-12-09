package hz222bp_assign1;
/*
 * Assignment 1; Exercise 5
 * Hailing Zhang(hz222bp) 
 * 2017-01-21
 */
public class PascalMain {
	public static void main(String[] args) {
		int n = 6; // the row of the triangle(begin with zero)
		display(n);
	}

	private static int[] pascalRow(int n) {// Calculate the numbers by recursion
		if (n == 1) {
			return new int[] { 1 };
		}
		if (n == 2) {
			return new int[] { 1, 1 };
		}
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			if (i == 0 || i == result.length - 1) {
				result[i] = 1;
			} else {
				result[i] = pascalRow(n - 1)[i - 1] + pascalRow(n - 1)[i];
			}
		}
		return result;
	}

	public static void display(int n) { // display blank and lines
		int r = n + 1;
		for (int i = r - 1; i >= 0; i--) {
			System.out.print("linje " + (-(i - n)) + " --> ");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			showRow(pascalRow(r - i));
		}
	}

	private static void showRow(int[] row) {// display the triangle
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i] + " ");
		}
		System.out.println();
	}
}
