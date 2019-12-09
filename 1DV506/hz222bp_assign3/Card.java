package hz222bp_assign3;

/*Assignment 3; Exercise 8
 *Hailing Zhang(hz222bp) 
 *2017-12-05*/
//Listing the number and suit of cards
enum Suit {
	SPADE, DIAMOND, CLUB, HEART
}

enum Rank {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

// match the suit and number of them
class Card {
	private Suit suit;
	private Rank rank;

	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	Rank getRank() {
		return rank;
	}

	Suit getSuit() {
		return suit;
	}

	public String toString() {
		return rank+" of "+suit;
	}
}
