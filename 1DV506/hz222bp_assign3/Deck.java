package hz222bp_assign3;

/*Assignment 3; Exercise 8 
 *Hailing Zhang(hz222bp) 
 *2017-12-06*/
import java.util.*;

public class Deck {
	List<Card> deck;
	private int count = 0;
	private int total = 52;
	// Create a card

	Deck() {
		deck = new ArrayList<Card>();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	// count the number of dealing and remaining cards
	public void countcard() {
		total--;
		count++;
	}

	// deal the card
	public String dealcard() {
		String card = "";
			card = deck.get(count).toString();
		return card;
	}

	// shuffle cards when there are 52 cards
	public boolean shuffleornot() {
		if (total == 52) {
			Collections.shuffle(deck);
			System.out.println("Cards are shuffled.");
			return true;
		} else {
			System.out.println("The number of remaining cards is " + total);
			System.out.println("It should only be possible to shuffle a deck if it contains 52 cards.");
			return false;
		}
	}
}
