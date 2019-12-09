package hz222bp_assign2;

/*Assignment 2; Exercise 13;VG-exercise;
 *Hailing Zhang(hz222bp) 
 *2017-11-20*/
import java.util.*;

public class SalaryRevision {
	public static void main(String[] args) {
		System.out.println("Provide salaries (and terminate input with 'X') : ");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int total = 0;
		int count = 0;
		int n;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			count++;
			list.add(n);
			total += n;
		}
		sc.close();

		Collections.sort(list);
		int median;
		if (count % 2 != 0) {
			median = Math.round(list.get(((count + 1) / 2) - 1));
		} else {
			median = Math.round((list.get((count / 2) - 1) + list.get(count / 2)) / 2);
		}
		System.out.println("Median: " + median);
		System.out.println("Average: " + (int) (total / count));
		System.out.println("Gap: " + (int) (Collections.max(list) - Collections.min(list)));
	}
}