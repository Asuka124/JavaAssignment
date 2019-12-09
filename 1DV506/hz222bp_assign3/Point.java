package hz222bp_assign3;

/*Assignment 3; Exercise 6
 *Hailing Zhang(hz222bp) 
 *2017-12-01*/
public class Point {
	private int x = 0;
	private int y = 0;

	// Initialising a new point
	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int m, int n) {
		x = m;
		y = n;
	}

	public String toString() {
		String str = ("(" + x + ", " + y + ")");
		return str;
	}

	// Change the coordinates
	public void moveToXY(int x2, int y2) {
		x = x2;
		y = y2;
	}

	public void move(int x3, int y3) {
		x += x3;
		y += y3;
	}

	// Check if two points are same
	public boolean isEqualTo(Point p2) {
		if (x == p2.x && y == p2.y) {
			return true;
		}
		return false;
	}

	// Calculate the distance
	public double distanceTo(Point p2) {
		double d = Math.sqrt(Math.pow((x - p2.x), 2) + Math.pow((y - p2.y), 2));
		return d;
	}
}
