package hz222bp_assign3.count_words;

import java.io.*;
import java.util.*;

/*Assignment 3; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2018-02-21*/
public class IdentyfyWordsMain {
	public static void main(String[] args) throws IOException {
		try { 
			//Read and filter the TXT 
			String text = filterFile("C:\\Users\\Ann Stormrage\\eclipse-workspace\\1DV507\\src\\hz222bp_assign3\\count_words\\history.txt");																		
			//Write the new TXT
			writeText(text, "C:\\Users\\Ann Stormrage\\eclipse-workspace\\1DV507\\src\\hz222bp_assign3\\count_words\\TEXT.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static String result = "";

	// filter the txt
	private static String filterFile(String path) throws IOException {
		String str;
		Scanner sc = new Scanner(new File(path));
		while (sc.hasNext()) {
			str = sc.nextLine() + "\n";
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (Character.isLetter(c) || Character.isWhitespace(c)) {
					result += c;
				}
			}
		}
		return result;
	}

	// Write the new txt
	private static void writeText(String text, String path) throws IOException {
		PrintWriter writer = new PrintWriter(new File(path));
		writer.print(text);
		writer.close();
		System.out.print("The new text is created at "+ path);
	}
}