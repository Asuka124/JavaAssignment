package hz222bp_assign3;
/*Assignment 3; Exercise 9
 *Hailing Zhang(hz222bp) 
 *2017-12-06*/
public class Play123Main {
	// A demonstration for check the following methods.
	public static void main(String[] args) {
		double times = 10000;// play the game 10000 times
		double win = 0;
		for (int k = 0; k <times; k++) {
			if (play()) {
				win++;
			}
		}
		System.out.println("Total: " + times + " , and the times of win is " + win);
		System.out.println("The probability is " + (win / times) * 100 + "%");
	}

	public static boolean play() {
		int count;// count 123
		String number = "";
		Deck d = new Deck();
		d.shuffleornot();
		for (int i = 0; i < 52; i++) {
			count = (i + 1) % 3;
			if (count == 0)
				count = 3;
			System.out.println("Count : " + count);
			switch (count % 3) {
			case 0:
				number = "TH";
				break;
			case 1:
				number = "AC";
				break;
			case 2:
				number = "TW";
				break;
			}
			String card = d.dealcard();//deal the card when count
			d.countcard();
			String str = card.substring(0, 2);
			System.out.println(card);
			if (number.equals(str)) {
				return false;
			}
		}
		return true;
	}
}