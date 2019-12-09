package hz222bp_assign1;

/*
 * Assignment 1; Exercise 3 
 * Hailing Zhang(hz222bp) 
 * 2017-01-20
 */

public class SumMain {
	public static void main(String[] args) {
		System.out.println("Sum = " + sum(100));
		System.out.println("Sum1 = " + sum1(1,100));
			 
		// Motivate my answer: Personally this is not a good solution for calculating sum. Since recursion is
		// slower than loop in sum. Let alone it used recursion twice.
	}

	// the sum of the integers from 1 to N
	public static int sum(int n) {
		if (n == 1) {
			return 1; 
		} else {
			return sum(n - 1) + n; // n+(n-1)+...+2+1
		}
	}

	// the sum of the integers from 1 to N/2
	public static int sum1(int start, int n) {
		return sum1(start, (start + n)/2) + sum1(((start + n)/2)+1, n);
	}
}

