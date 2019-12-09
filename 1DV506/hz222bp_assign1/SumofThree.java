package hz222bp_assign1;

/*
* SumofThree.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.Scanner;
public class SumofThree{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a three digit number: ");
		int number = sc.nextInt();//input and convert to numbers
		
		int hundreds = (number % 1000) / 100;
		int tens = (number % 100) / 10;
		int ones = number % 10;
		int sum = hundreds + tens + ones;
	System.out.println("Sum of digits: " + sum);//caculate and print out
	}
}
