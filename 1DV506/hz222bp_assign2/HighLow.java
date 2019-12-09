package hz222bp_assign2;

/*Assignment 2; Exercise 4
 *Hailing Zhang(hz222bp) 
 *2017-11-11*/
import java.util.*;

class HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int randomNum = ran.nextInt(100) + 1;
		int count = 0;
		System.out.println("GAME BEGIN.Please provide a interger:");
		System.out.print("Guess 1: ");
		while (true) {
			count += 1;
			int guessNum = sc.nextInt();

			if (guessNum < randomNum) {

				System.out.println("Clue: higher");
				System.out.print("Guess " + (count + 1) + ": ");
			} else if (guessNum > randomNum) {

				System.out.println("Clue: lower");
				System.out.print("Guess " + (count + 1) + ": ");
			} else {
				int count1 = count;
				if (count1 <= 10) {
					System.out.println("Correct answer after only " + count1 + " guesses – Excellent!");
				} else {
					System.out.println("Finally,correct answer after " + count1 + " guesses.");
				}
				break;
			}
		}
		sc.close();
	}
}