package hz222bp_assign1;

/*
* Time.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.*;
public class Time{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a number of seconds:");
		int seconds = sc.nextInt();//input the number of seconds
		
		int hour = seconds/3600;//caculate and print out
		int minute = (seconds%3600)/60;
		int second = (seconds%60);
		System.out.println("This corresponds to:"+hour+" hours, "+minute+" minutes"+" and "+second+" seconds.");
	}
}
