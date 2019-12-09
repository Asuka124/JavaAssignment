package hz222bp_assign3;

/*Assignment 3; Exercise 1
 *Hailing Zhang(hz222bp) 
 *2017-11-27*/
public class Arrays {
	// A demonstration for check methods.
	public static void main(String[] args) {
		int[] n = { -1, 0, 3, 5, 4, 6, 7, 3 };//give a example of the array
		System.out.println("Sum: " + sum(n));//the sum of all elements
		System.out.println("String:" + toString(n));
		System.out.println("Added n: " + toString(addN(n, 1)));// eg. n=1,all elements add 1 in the array
		System.out.println("Reverse: " + toString(reverse(n)));
		System.out.println("HasN: " + hasN(n, -3));// eg. n=-3,if the array contains -3
		System.out.println("Sort: " + toString(sort(n)));//sort
		int[] compare = { 5, 4 };// provide a array for comparing
		System.out.println("Subsequence:" + hasSubsequence(n, compare));//compare two arrays
		replaceAll(n, 3, -2);// replace all 3 in the array to -2
		System.out.println("Replace: " + toString(n));
	}

	// Adding all elements of the array arr and returning the sum
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Printing out a string of the content of the array arr.
	public static String toString(int[] arr) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			str.append(arr[i]);
			if (i < arr.length - 1) {
				str.append(", ");
			}
		}
		return str.toString();
	}

	// A new array, where n have been added to all elements in arr.
	public static int[] addN(int[] arr, int n) {
		int[] added = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			added[i] = arr[i] + n;
		}
		return added;
	}

	// A new array consists of all elements in arr in reverse order.
	public static int[] reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse[arr.length - i - 1] = arr[i];
		}
		return reverse;
	}

	// Determine if n is contained in the array arr.
	public static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}

	// replacing all occurrences of old with nw in arr
	public static void replaceAll(int[] arr, int old, int nw) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old)
				arr[i] = nw;

		}
	}

	// Sort array increasing order
	public static int[] sort(int[] arr) {
		int[] brr = new int[arr.length];
		for (int a = 0; a < arr.length; a++) {
			brr[a] = arr[a];
		}
		for (int i = 0; i < brr.length; i++) {
			for (int j = 1; j < brr.length - i; j++) {
				if (brr[j - 1] > brr[j]) {
					int temp;
					temp = brr[j - 1];
					brr[j - 1] = brr[j];
					brr[j] = temp;
				}

			}
		}
		return brr;
	}

	// Determine if the sequence is right
	public static boolean hasSubsequence(int[] arr, int[] sub) {
		int x, y, count;
		for (int i = 0; i <= arr.length - sub.length; i++) {
			x = 0;
			y = i;
			count = 0;
			while (sub[x] == arr[y]) {
				x++;
				y++;
				count++;
				if (count == sub.length)
					return true;
			}
		}
		return false;
	}
}
