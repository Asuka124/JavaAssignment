package hz222bp_assign2;

/*Assignment 2; Exercise 11
 *Hailing Zhang(hz222bp) 
 *2017-11-19;*/
import java.util.*;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter positive integers. End by giving a negative integer.");
		int count = 0;
		int n = 0;

		do {
			count++;
			System.out.print("Integer " + count + " : ");
			n = sc.nextInt();
			if (n < 0) {
				break;
			} else {
				list.add(n);
			}
		} while (n >= 0);
		sc.close();
		System.out.println("Number of positive integers: " + (count - 1));
		//Collections.sort(list, Collections.reverseOrder());
		String str = list.toString().replace("[", "").replace("]", "");
		System.out.println("In reverse order: " + str);


	}
}
