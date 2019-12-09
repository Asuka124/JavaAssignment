package hz222bp_assign1;
/*
* BMI.java
*
* Author: Hailing Zhang
* Created 2017-11/05
*/
import java.util.*;

public class BMI{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give your length in meters:");
		float a = sc.nextFloat();
		System.out.print("Give your weight in kilograms:");//user provide datas about length and weight
		
		float b = sc.nextFloat();
		System.out.println("Your BMI is:"+ (int)Math.round(b/(a*a)));//caculate the BMI
	}
}
