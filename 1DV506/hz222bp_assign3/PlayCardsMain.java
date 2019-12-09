package hz222bp_assign3;

import java.util.*;
/*Assignment 3; Exercise 8
 *Hailing Zhang(hz222bp) 
 *2017-12-07*/

public class PlayCardsMain {
	// A demonstration for check methods.
	public static void main(String[] args) {
		// ask how many cards do the user want to deal
		Deck deck = new Deck();
		// shuffle 52 cards before dealing
		deck.shuffleornot();
		// decide the number of dealing cards
		Scanner sc = new Scanner(System.in);
		System.out.println("How many crads do you want to deal? ");
		int c = sc.nextInt();
		//check if the user input the right number
		if (c <= 0) {
			System.out.println("Please input a positive integer.");
		} else if (c > 52) {
			System.out.println("There are 52 cards in total.");
		} else {
			// count the number of dealing and remaining card
			for (int i = 0; i < c; i++) {
				deck.countcard();
				System.out.println(deck.dealcard());
			}
			// try to shuffle again
			deck.shuffleornot();
		}
	}
}