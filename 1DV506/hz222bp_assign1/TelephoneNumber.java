package hz222bp_assign1;
/*
* TelephoneNumber.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.*;

public class TelephoneNumber{
	public static void main(String[] args)throws Exception{
		Random random = new Random();
		int x1 = random.nextInt(10);
		int x2 = random.nextInt(10);
		int x3 = random.nextInt(10);

		int z = random.nextInt(10) + 1;

		int y1 = random.nextInt(10);
		int y2 = random.nextInt(10);
		int y3 = random.nextInt(10);
		int y4 = random.nextInt(10);
		int y5 = random.nextInt(10);
		System.out.println("A random telephone number: "+"0"+x1+x2+x3+"-"+z+y1+y2+y3+y4+y5);
	}
}