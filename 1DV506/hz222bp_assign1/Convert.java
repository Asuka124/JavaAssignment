package hz222bp_assign1;

/* Convert.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.*;

public class Convert {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a temperature in Fahrenheit: ");// input temperature in Fahrenheit
		double a = sc.nextFloat();
		double b = (((a - 32) * 5) / 9);
		String c = String.format("%.1f", b);
		System.out.println("The temperature in Celsius is: " + c);// convert to celsius and print out on the screen
	}
}
