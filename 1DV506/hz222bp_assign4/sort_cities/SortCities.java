package hz222bp_assign4.sort_cities;

/*Assignment 4; Exercise 4
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/
import java.util.Arrays;
import java.util.Iterator;

public class SortCities implements Iterator<City> {
	City[] post;
	int max;
	int nextCity = 0;

	public SortCities(City[] towns, int numberOfCities) {
		post = towns;
		max = numberOfCities;
	}

	public void Sort() {
		Arrays.sort(post);
	}

	public boolean hasNext() {
		if (nextCity >= max) {
			return false;
		} else {
			return true;
		}
	}

	public City next() {
		return post[nextCity++];
	}
}
