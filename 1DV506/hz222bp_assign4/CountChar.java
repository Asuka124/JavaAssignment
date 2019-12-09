package hz222bp_assign4;

/*Assignment 4; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-12-18*/
import java.util.*;
import java.io.*;

public class CountChar {
	public static void main(String[] args) {
		String filePath = "D:\\history.txt";
		System.out.println("Reading documents from file: " + filePath);
		// count the including contents
		int digit = 0;
		int whiteSpace = 0;
		int upp = 0;
		int low = 0;
		int other = 0;
		int line = 0;// count the return
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
			String readLine = null;
			while ((readLine = in.readLine()) != null) {
				line++;
				char c;
				for (int i = 0; i < readLine.length(); i++) {
					c = readLine.charAt(i);
					if (Character.isDigit(c)) {
						digit++;
					} else if (Character.isLowerCase(c)) {
						low++;
					} else if (Character.isUpperCase(c)) {
						upp++;
					} else if (Character.isWhitespace(c)) {
						whiteSpace++;
					} else {
						other++;
					}
				}
			}
			System.out.println("Number of upper case letters: " + upp);
			System.out.println("Number of lower case letters: " + low);
			System.out.println("Number of digits: " + digit);
			// The different result caused by the definition of "end of line characters"
			// when importing point files produced on older Macintosh computers.
			// (according to the explanation on mymoodle)
			System.out.println("Number of \"whitespaces\": " + (whiteSpace + line));
			System.out.println("Number of others: " + other);
			// throw exceptions
		} catch (FileNotFoundException ex) {
			System.out.println("ex:" + ex.getMessage());
		} catch (IOException e) {
			System.out.println("e:" + e.getMessage());
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (Exception exx) {
			}
		}
	}
}