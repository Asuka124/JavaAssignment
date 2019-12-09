package hz222bp_assign1;
/*
* WindChill.java
*
* Author: Hailing Zhang
* Created 2017-11-06
*/
import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		System.out.print("Temperature (Celsius): ");
        double a = in.nextDouble();
        
		System.out.print("Wind speed (m/s): ");
		double b = in.nextDouble();
        double c = b*3.6;
        
		double d =  13.12 + (0.6215*a) - (11.37*Math.pow(c,0.16)) + (0.3965*a*Math.pow(c,0.16));
        String windchill = String.format("%.1f",d);
		
		System.out.println("Wind Chill Temperature (c): "+ windchill);
    }
}
