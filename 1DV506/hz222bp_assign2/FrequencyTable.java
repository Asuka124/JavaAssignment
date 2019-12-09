package hz222bp_assign2;

/*Assignment 2; Exercise 12
 *Hailing Zhang(hz222bp) 
 *2017-11-20;*/
import java.util.*;

public class FrequencyTable {
	public static void main(String[] args) {
		System.out.println("Frequencies when rolling a dice 6000 times.");
		Random ran = new Random();
		int[] list = { 0, 0, 0, 0, 0, 0 };

		for (int count = 0; count <= 6000; count++) {
			int temp = ran.nextInt(6) + 1;
			list[temp - 1]++;
		}
		for (int j = 1; j <= list.length; j++) {
			System.out.println(j + ":" + list[j - 1]);
		}
	}
}