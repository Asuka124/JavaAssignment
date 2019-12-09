package hz222bp_assign4;

/*Assignment 4; Exercise 1
 *Hailing Zhang(hz222bp) 
 *2017-12-18*/
import java.io.*;
import java.util.*;

public class Histogram {
	public static void main(String[] args) {
		String path = "D://";
		String fileName = "int.dat";
		File data = new File(path + fileName);

		// create data file
		if (!data.exists() && !data.isFile()) {
			try {
				createDirectory(path);
				createFile(fileName);

				Scanner sc = new Scanner(System.in);
				System.out.println("How many integers do you want to get? ");
				int n = sc.nextInt();

				PrintWriter pw = new PrintWriter(data);
				createText(pw, n);

				pw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// read file
		try {
			Scanner sc = new Scanner(data);
			ArrayList<String> number = new ArrayList<>();
			while (sc.hasNextLine()) {
				number.add(sc.nextLine());
			}
			String[] nu = new String[number.size()];
			for (int i = 0; i < number.size(); i++) {
				nu[i] = number.get(i);
			}
			System.out.println("Reading integers from file: " + data.getAbsolutePath());
			System.out.println("Number of integers in the interval [1,100]: " + IntegersInInterval(nu));
			System.out.println("Others: " + (number.size() - IntegersInInterval(nu)));
			printHistogram(nu);

			sc.close();
			deleteFile(path + fileName); // to delete test file for running again
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createDirectory(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public static void createFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void deleteFile(String filePath) throws IOException {
		File file = new File(filePath);
		if (!file.exists()) {
			return;
		}
		if (file.isFile()) {
			file.delete();
		} else if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				deleteFile(filePath + "\\" + files[i]);
			}
			file.delete();
		}
	}

	public static PrintWriter createText(PrintWriter pw, int tn) {
		Random rd = new Random();
		for (int i = 0; i < tn; i++) {
			int z = rd.nextInt(167) + 1; // get integers in the bigger ranger
			pw.println(z);
		}
		return pw;
	}

	public static int IntegersInInterval(String[] arr) {
		int in = 0;
		int t;
		for (int i = 0; i < arr.length; i++) {
			t = Integer.parseInt(arr[i]);
			if (t >= 1 && t <= 100) {
				in++;
			}
		}
		return in;
	}

	public static void printHistogram(String[] arr) {
		int ten = 0;
		int twenty = 0;
		int thirty = 0;
		int fourty = 0;
		int fifty = 0;
		int sixty = 0;
		int seventy = 0;
		int eighty = 0;
		int ninety = 0;
		int hundred = 0;

		for (int i = 0; i < arr.length; i++) {
			int t = Integer.parseInt(arr[i]);
			if (t > 0 && t <= 100) {
				if (t <= 10)
					ten++;
				else if (t <= 20)
					twenty++;
				else if (t <= 30)
					thirty++;
				else if (t <= 40)
					fourty++;
				else if (t <= 50)
					fifty++;
				else if (t <= 60)
					sixty++;
				else if (t <= 70)
					seventy++;
				else if (t <= 80)
					eighty++;
				else if (t <= 90)
					ninety++;
				else
					hundred++;
			}
		}

		System.out.println("Histogram");
		System.out.println("  1  - 10  | " + Star(ten));
		System.out.println("  11 - 20  | " + Star(twenty));
		System.out.println("  21 - 30  | " + Star(thirty));
		System.out.println("  31 - 40  | " + Star(fourty));
		System.out.println("  41 - 50  | " + Star(fifty));
		System.out.println("  51 - 60  | " + Star(sixty));
		System.out.println("  61 - 70  | " + Star(seventy));
		System.out.println("  71 - 80  | " + Star(eighty));
		System.out.println("  81 - 90  | " + Star(ninety));
		System.out.println("  91 - 100 | " + Star(hundred));
	}

	public static String Star(int amount) {
		String star = "";
		while (amount != 0) {
			star = star + "*";
			amount--;
		}
		return star;
	}
}
