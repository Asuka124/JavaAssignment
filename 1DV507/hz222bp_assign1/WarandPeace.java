package hz222bp_assign1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Assignment 1; Exercise 9(VG-task)
 * Hailing Zhang(hz222bp) 
 * 2017-01-24
 */
public class WarandPeace {
	public static void main(String[] args) throws IOException {
		String filepath="D:\\test\\WarAndPeace.txt";
		
		String text = readText(filepath);
		System.out.println("Read from : "+filepath);
		
		String[] words = text.split(" ");
		System.out.println("Initial word count: " + words.length);
		
		Stream<String> uniqueWordCount = Arrays.stream(words).map(String::toLowerCase)
				.filter(word -> word.matches("^[^\\\\d\\\\s\\\\W[-’]]*$"))// just keep lower case, " ' " and " - " .
				.distinct();
		System.out.printf("Unique words: %d", uniqueWordCount.count());
	}

	private static String readText(String filepath) throws IOException {
		File file = new File(filepath);
		if (!file.exists()) {
			return "";
		}
		StringBuffer str = new StringBuffer();
		try {
			FileReader in = new FileReader(file);
			BufferedReader buffer = new BufferedReader(in);
			String line = null;
			while ((line = buffer.readLine()) != null) {
				str.append(line + "/r/n");
			}
			buffer.close();
			in.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
		return str.toString();
	}
}

