package hz222bp_assign3;

/*Assignment 3; Exercise 7 test(Main)(with Euclidean algorithm)
 *Hailing Zhang(hz222bp) 
 *2017-11-29*/
public class FractionMain {
	public static void main(String[] args) {
		// A demonstration for check methods.
		// Setting the values of fractions
		Fraction f1 = new Fraction();
		f1.setFraction(2, 4);//out-print the original fraction
		System.out.println("Fraction 1: " + f1);// the fraction after Euclidean

		Fraction f2 = new Fraction();
		f2.setFraction(-1, 0);
		System.out.println("Fraction 2: " + f2);

		// Equal or Negative
		System.out.println("Is fraction 1 is negative? " + f1.isNegative());
		System.out.println("Is fraction 2 is negative? " + f2.isNegative());
		System.out.println("Is fraction 1 equal to fraction 2? " + f1.isequalsto(f2));

		// Calculation
		Fraction f3 = f1.add(f2);
		System.out.println(f1 + " + " + f2 + " = " + f3);

		Fraction f4 = f1.minus(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Fraction f5 = f1.multiply(f2);
		System.out.println(f1 + " x " + f2 + " = " + f5);

		Fraction f6 = f1.divide(f2);
		System.out.println(f1 + " / " + f2 + " = " + f6);
	}
}
