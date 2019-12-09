package hz222bp_assign3;

/*Assignment 3; Exercise 1
 *Hailing Zhang(hz222bp) 
 *2018-02-20*/
public class EuclideanMain {
	public static void main(String[] args) {
		EuclideanMain em = new EuclideanMain();
		em.Result(18, 12);
		em.Result(42, 56);
		em.Result(9, 28);
	}

	private int Nu;
	private int De;

	// Getting the values of two positive integers
	public void setNumerator(int n) {
		if (n <= 0) {
			System.out.println("Please input a positive integer.");
			Nu = Math.abs(n);
		} else {
			Nu = n;
		}
	}

	public int getNumerator() {
		return Nu;
	}

	public void setDenominator(int d) {
		if (d <= 0) {
			System.out.println("Please input a positive integer.");
			De = Math.abs(d);
		} else {
			De = d;
		}
	}

	public int getDenominator() {
		return De;
	}

	// Calculate the greatest common divisor by recursion
	public static int GCD(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0) {
			return n;
		} else {
			return GCD(n, m % n);
		}
	}

	public void Result(int n, int d) {
		setNumerator(n);
		setDenominator(d);
		System.out.println("GCD(" + n + " , " + d + ")= " + GCD(Nu, De));
	}
}
