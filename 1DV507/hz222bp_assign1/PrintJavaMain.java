package hz222bp_assign1;

import java.io.File;

/*
 * Assignment 1; Exercise 4
 * Hailing Zhang(hz222bp) 
 * 2017-01-20
 */
public class PrintJavaMain {
	public static void main(String[] args) {
		PrintJavaMain pj = new PrintJavaMain();
		String filepath = "C:\\Users\\Ann Stormrage\\Downloads\\1DV507";
		System.out.println(filepath);
		pj.read(filepath);
	}

	File mainfile = null;// read files from their path

	int level = 0;// change the blank according to the level of file
	String blank;

	int count;// count all file

	public void read(String path) {
		mainfile = new File(path);
		// number + filename + size
		if (mainfile.listFiles() == null) {
			System.out.println(mainfile.getName() + "  " + mainfile.length() + "byte(s)");
			return;
		}
		for (File subfile : mainfile.listFiles()) {
			if (subfile.isDirectory()) {
				count++;
				level = subfile.getParent().split("\\\\").length;
				blank = forblank(level);

				System.out.println("(" + count + ")" + blank + subfile.getName() + " " + subfile.length() + "byte(s)");
				this.read(subfile.getPath());// Recursion

				for (File sub : subfile.listFiles()) {// read file until empty
					if (sub.isFile()) {
						count++;
						level = sub.getParent().split("\\\\").length;
						blank = forblank(level);
						System.out.println(
								"(" + count + ")" + blank + sub.getName() + "  " + subfile.length() + "byte(s)");
					}
				}
			}
		}
	}

	// for the intent blank
	public static String forblank(int level) {
		String blank = "";
		for (int i = 0; i < level; i++) {
			blank = blank + "　";
		}
		return blank;
	}
}