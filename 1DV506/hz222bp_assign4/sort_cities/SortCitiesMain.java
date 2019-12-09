package hz222bp_assign4.sort_cities;

/*Assignment 4; Exercise 4
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/

import java.util.*;
import java.io.*;

public class SortCitiesMain {
	public static void main(String[] args) throws IOException {
		String city = "";
		String all;
		String codeString;
		List<City> citycode = new ArrayList<City>();
		int zip = 0;

		String path = "D:\\Cities.txt";
		System.out.println("Reading cities from " + path);
		File file = new File(path);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			all = sc.nextLine();
			String[] string = all.split(";");
			city = String.valueOf(string[0]);

			codeString = String.valueOf(string[1]);
			zip = Integer.parseInt(codeString);

			citycode.add(new City(city, zip));
			Collections.sort(citycode);
		}
		for (City i : citycode) {
			System.out.println(i);
		}
		sc.close();
	}
}