package hz222bp_assign1;

import java.awt.Color;
import java.io.*;
import java.util.*;
import org.knowm.xchart.*;

/*
 * Assignment 1; Exercise 6
 * Hailing Zhang(hz222bp) 
 * 2017-01-23
 */
public class Histogram { // The part was changed is from line 106 to 129
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

			// show the charts
			System.out.println("The two chats are:");
			printHistogram(nu);

			sc.close();
			deleteFile(path + fileName); // to delete test file for running again
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// this is the only part I changed
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

		// Create the pie chart
		CategoryChart pie = new CategoryChartBuilder().width(800).height(600).title("Histogram").xAxisTitle("Range")
				.yAxisTitle("Number").build();
		pie.addSeries("Histogram bra", Arrays.asList(new Integer[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }), Arrays
				.asList(new Integer[] { ten, twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninety, hundred }));
		pie.getStyler().setHasAnnotations(true);

		// Create the bar chart
		PieChart bar = new PieChartBuilder().width(800).height(600).title("Histogram").build();
		Color[] sliceColors = new Color[] { new Color(66, 99, 100) };
		bar.addSeries("1-10", ten);
		bar.addSeries("11-20", twenty);
		bar.addSeries("21-30", thirty);
		bar.addSeries("31-40", fourty);
		bar.addSeries("41-50", fifty);
		bar.addSeries("51-60", sixty);
		bar.addSeries("61-70", seventy);
		bar.addSeries("71-80", eighty);
		bar.addSeries("81-90", ninety);
		bar.addSeries("91-100", hundred);

		// Display the charts
		new SwingWrapper(pie).displayChart();
		new SwingWrapper(bar).displayChart();
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
}
