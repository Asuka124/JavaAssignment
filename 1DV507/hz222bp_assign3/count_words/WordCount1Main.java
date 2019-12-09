package hz222bp_assign3.count_words;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*Assignment 3; Exercise 5
 *Hailing Zhang(hz222bp) 
 *2018-02-23*/
public class WordCount1Main {

	public static void main(String[] args) throws IOException {
		HashSet<Word> haha = new HashSet<Word>();
		TreeSet<Word> tree = new TreeSet<Word>();
		String read = "";
		Scanner sc = null;
		String path = "C:\\Users\\Ann Stormrage\\eclipse-workspace\\1DV507\\src\\hz222bp_assign3\\count_words\\TEXT.txt";

		try {
			String sss = readFile(path);
			sc = new Scanner(sss);
			while (sc.hasNext()) {
				read = sc.next();
				Word word = new Word(read); // Create an object of the class Word

				tree.add(word);// Add the object to tree and hash set
				haha.add(word);
			}
			sc.close();

			//Tree Iterator in alphabetical order
			int count = 0;
			System.out.println("Tree Iterator:");
			Iterator<Word> itt = tree.iterator();
			while (itt.hasNext()) {
				System.out.println(++count + " " + itt.next());
			}

			// Size
			System.out.println("Tree size: " + tree.size());
			System.out.println("Hash size: " + haha.size());

		} catch (FileNotFoundException e) {
			//For tracking the exception
			System.err.println(e.getMessage());
		}
	}

	private static String readFile(String path) throws IOException {
		StringBuilder history = new StringBuilder();
		Scanner sc = new Scanner(new File(path));
		while (sc.hasNext())
			history.append(sc.nextLine());
		sc.close();
		return history.toString();
	}
}

