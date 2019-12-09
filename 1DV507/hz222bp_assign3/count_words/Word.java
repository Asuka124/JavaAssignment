package hz222bp_assign3.count_words;
/*Assignment 3; Exercise 4
 *Hailing Zhang(hz222bp) 
 *2018-02-22*/

public class Word implements Comparable<Word> {

	private String word;

	public Word(String str) {
		if (str == null) {
			throw new NullPointerException();
		} else {
			this.word = str.toLowerCase();
		}
	}

	public String toString() {
		return word;
	}

	/* Override Object methods */
	public int hashCode() {
		return word.hashCode();
	}

	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (other instanceof Word) {
			Word w = (Word) other;
			return this.hashCode() == w.hashCode();
		}
		return false;
	}

	/* Implement Comparable */
	public int compareTo(Word w) {
		return word.compareTo(w.word);
	}
}
