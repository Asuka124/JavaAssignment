package hz222bp_assign4.sort_cities;

/*Assignment 4; Exercise 4
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/
public class City implements Comparable<City> {
	private String name;
	private int zip;
	int size = 0;

	public City(String name, int zip) {
		this.name = name;
		this.zip = zip;
		size++;
	}

	public String getCity() {
		return name;
	}

	public int getCode() {
		return zip;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		String result = zip + "; " + name;
		return result;
	}

	public int compareTo(City compareCity) {
		int compareZip = ((City) compareCity).getCode();
		int c = (this.zip - compareZip);
		return c;
	}
}
