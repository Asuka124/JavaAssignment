package hz222bp_assign1;
/*
* Change.java
*
* Author: Hailing Zhang
* Created 2017-11/05
*/
import java.util.*;

public class Change{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Price: ");
		float a = sc.nextFloat();
		System.out.print("Payment: ");
		float b = sc.nextFloat();//input price and payment
		
		System.out.println("Change: "+ (int)Math.round(b-a)+" kronor");//caculate the change for different face values
		System.out.println("1000kr bills: "+ (int)Math.round(b-a)/1000);
		System.out.println(" 500kr bills: "+ ((int)Math.round(b-a)%1000)/500);
		System.out.println(" 100kr bills: "+ (((int)Math.round(b-a)%1000)%500)/100);
		System.out.println("  50kr bills: "+ ((((int)Math.round(b-a)%1000)%500)%100)/50);
		System.out.println("  20kr bills: "+ (((((int)Math.round(b-a)%1000)%500)%100)%50)/20);
		System.out.println("  10kr coins: "+ ((((((int)Math.round(b-a)%1000)%500)%100)%50)%20)/10);
		System.out.println("   5kr coins: "+ (((((((int)Math.round(b-a)%1000)%500)%100)%50)%20)%10)/5);
		System.out.println("   1kr coins: "+ (((((((int)Math.round(b-a)%1000)%500)%100)%50)%20)%10)%5);
	}
}