package hz222bp_assign2;

/*Assignment 2; Exercise 8; VG-exercise
 *Hailing Zhang(hz222bp) 
 *2017-11-13*/
public class BirthdayCandles {

	public static void main(String[] args) {

		int candleCount = 24;
		double total = 0;
		double nowTotal = 0;
		double now = 0;

		for (int i = 1; i <= 100; i++) { 
			total += i;
			if (Math.ceil(total / candleCount) > nowTotal) {
				now = Math.ceil(total / candleCount) - nowTotal;
				nowTotal = Math.ceil(total / candleCount);
				System.out.println("Before birthday " + i + "," + " buy " + (int) now + " box(es)");
			}
		}
		int result = (int) Math.ceil(total / candleCount);
		int remain = (int) (result * candleCount - total);
		System.out.print("Total number of boxes: " + result + ", Remaining candles: " + remain);
	}

}