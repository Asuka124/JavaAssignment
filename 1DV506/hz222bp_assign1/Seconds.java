package hz222bp_assign1;
/*
* Seconds.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.*;

public class Seconds{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Hours:");
		int a = sc.nextInt();
		System.out.print("Minutes:");
		int b = sc.nextInt();
		System.out.print("Seconds:");
		int c = sc.nextInt();
		System.out.println("Total time measured in seconds:"+(3600*a+60*b+c));
	}
}
