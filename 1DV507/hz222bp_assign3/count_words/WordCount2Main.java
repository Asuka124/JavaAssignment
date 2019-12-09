package hz222bp_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/*Assignment 3; Exercise 7
 *Hailing Zhang(hz222bp) 
 *2018-02-25*/
public class WordCount2Main {
	public static void main(String[] args) {
		Scanner sc = null;
		HashWordSet hash = new HashWordSet();
		TreeWordSet tree = new TreeWordSet();
		String txt = "";
		String path = "C:\\Users\\Ann Stormrage\\eclipse-workspace\\1DV507\\src\\hz222bp_assign3\\count_words\\TEXT.txt";

		try {
			File file = new File(path); //Read file and save as string
			sc = new Scanner(file); 
			while (sc.hasNext()) { 
				txt = sc.next(); 
				Word word = new Word(txt); 
											
				tree.add(word); 
				hash.add(word);
			}
			sc.close();

			System.out.println("Tree Iterator: ");
			int count = 0;//Show the Tree Iterator 
			Iterator<Word> itt = tree.iterator();
			while (itt.hasNext())
				System.out.println(++count + "  " + itt.next());
			
			//Iterator<Word> ith = hash.iterator();
			
			//The number of words
			System.out.println("Tree size: " + tree.size());
			System.out.println("Hash size: " + hash.size() + "\n");

			//The set to string
			System.out.println("Tree set: " + tree.toString());
			System.out.println("Hash set: " + hash.toString() + "\n");

			//Check if a word were in the set
			Word hashWord = new Word("paper");
			Word treeWord = new Word("paper");
			System.out.println("Tree set contains \"" + treeWord + "\"" + ": " + tree.contains(treeWord));
			System.out.println("Hash set contains \"" + hashWord + "\"" + ": " + hash.contains(hashWord));
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}

	}
}
