package hz222bp_assign3;

/*Assignment 3; Exercise 7 (with Euclidean algorithm)
 *Hailing Zhang(hz222bp) 
 *2017-11-29*/
public class Fraction {
	private int Nu;
	private int De;

	// Getting numerator and denominator to Set the value of fractions
	public void setNumerator(int n) {
		Nu = n;
		reduct();
	}

	public int getNumerator() {
		return Nu;
	}

	public void setDenominator(int d) {
		if (d == 0) {
			De = 1; // If the denominator is zero, give suggestions and change it to 1
			System.out.println("Denominator should not be zero. Denominator is changed to 1.");
		} else {
			De = d;
			reduct();
		}
	}

	public int getDenominator() {
		return De;
	}

	public void setFraction(int n, int d) {
		setNumerator(n);
		setDenominator(d);
		System.out.println("Please input the fraction: " + n + " / " + d);
		reduct();
	}

	// Changing to String
	public String toString() {
		if (isNegative())
			return "-" + Math.abs(Nu) + "/" + Math.abs(De);
		else
			return Math.abs(Nu) + "/" + Math.abs(De);
	}

	// Check these are negative or equal
	public boolean isNegative() {
		if (Nu * De < 0) {
			return true;
		}
		return false;
	}

	public boolean isequalsto(Fraction f) {
		if (Nu == f.Nu && De == f.De)
			return true;
		else
			return false;
	}

	// Euclidean algorithm
	private void reduct() {
		int minValue = Math.min(Math.abs(Nu), Math.abs(De));
		for (int i = minValue; i >= 1; i--) {
			if (Nu % i == 0 && De % i == 0) {
				Nu = Nu / i;
				De = De / i;
				break;
			}
		}
	}

	// Four kinds of calculations
	public Fraction add(Fraction f) {
		Fraction fraction = new Fraction();
		fraction.Nu = Nu * f.De + f.Nu * De;
		fraction.De = De * f.De;
		fraction.reduct();
		return fraction;
	}

	public Fraction minus(Fraction f) {
		Fraction fraction = new Fraction();
		fraction.Nu = Nu * f.De - f.Nu * De;
		fraction.De = De * f.De;
		fraction.reduct();
		return fraction;
	}

	public Fraction multiply(Fraction f) {
		Fraction fraction = new Fraction();
		fraction.Nu = Nu * f.Nu;
		fraction.De = De * f.De;
		fraction.reduct();
		return fraction;
	}

	public Fraction divide(Fraction f) {
		Fraction fraction = new Fraction();
		fraction.Nu = Nu * f.De;
		fraction.De = De * f.Nu;
		fraction.reduct();
		return fraction;
	}
}
