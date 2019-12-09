package hz222bp_assign4.time;

import java.util.Arrays;
import java.util.Random;

/*Assignment 4; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2018-12-03*/
public class Exercise3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			IntegerInsertion();
		}
		for (int i = 0; i < 5; i++) {
			IntegerMerge();
		}
		for (int i = 0; i < 5; i++) {
			StringInsertion();
		}
		for (int i = 0; i < 5; i++) {
			StringMerge();
		}
	}

	// 1.1Insertion sort Integer
	private static int[] GetRandomInteger(int length, int max) {
		Random ra = new Random();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ra.nextInt((max - 1) + 1) + 1;
		}
		return arr;
	}

	public static void IntegerInsertion() {
		int[] inArr = GetRandomInteger(1000, 10000);
		int time = 0;
		while (time < 1000) {
			long begin = System.currentTimeMillis();
			insertionSortInteger(inArr);
			long after = System.currentTimeMillis();

			time = (int) (after - begin);
			System.out.println(
					"During " + time + " milliseconds, the length of integers sorted by insertion: " + inArr.length);

			if (time == 999 || time == 1000 || time == 1001) {
				break;
			} else if (time > 1001 && time <= 1050) {
				inArr = GetRandomInteger(inArr.length - 1, inArr.length * 10);
				time = 0;
			} else if (time > 1050) {
				inArr = GetRandomInteger(inArr.length - 1000, inArr.length * 10);
				time = 0;
			} else if (time <= 950) {
				inArr = GetRandomInteger(inArr.length + 1000, inArr.length * 10);
				time = 0;
			} else {
				inArr = GetRandomInteger(inArr.length + 1, inArr.length * 10);
			}
		}
	}

	public static int[] insertionSortInteger(int[] in) {
		for (int i = 0; i < in.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (in[j - 1] <= in[j]) {
					break;
				}
				int temp = in[j];
				in[j] = in[j - 1];
				in[j - 1] = temp;
			}
		}
		return in;
	}

	// 1.2 Merge Sort Integer
	public static void IntegerMerge() {
		int[] arr = GetRandomInteger(1000, 10000);
		int time = 0;
		while (time <= 1000) {
			long start = System.currentTimeMillis();
			mergeSortInteger(arr);
			long end = System.currentTimeMillis();
			time = (int) (end - start);

			System.out
					.println("During " + time + " milliseconds, the length of integers sorted by merge: " + arr.length);

			if (time == 999 || time == 1000 || time == 1001) {
				break;
			} else if (time > 1001 && time <= 1050) {
				arr = GetRandomInteger(arr.length - 1, arr.length * 10);
				time = 0;
			} else if (time > 1050) {
				arr = GetRandomInteger(arr.length - 1000, arr.length * 10);
				time = 0;
			} else if (time <= 950) {
				arr = GetRandomInteger(arr.length + 1000, arr.length * 10);
				time = 0;
			} else {
				arr = GetRandomInteger(arr.length + 1, arr.length * 10);
			}
		}
	}

	public static int[] mergeSortInteger(int[] in) {
		int[] temp = in;
		if (temp.length < 2) {
			return temp;
		} else {
			int mid = temp.length / 2;
			int[] left = Arrays.copyOfRange(temp, 0, mid);
			int[] right = Arrays.copyOfRange(temp, mid, temp.length);

			left = mergeSortInteger(left);
			right = mergeSortInteger(right);

			// Merge
			int ileft = 0;
			int iright = 0;
			int j = 0;

			while (ileft < left.length && iright < right.length) {
				if (left[ileft] < right[iright]) {
					temp[j] = left[ileft];
					ileft++;
				} else {
					temp[j] = right[iright];
					iright++;
				}
				j++;
			}
			if (ileft < left.length) {
				for (int i = ileft; i < left.length; i++) {
					temp[j] = left[i];
					j++;
				}
			} else {
				for (int i = iright; i < right.length; i++) {
					temp[j] = right[i];
					j++;
				}
			}
			return temp;
		}
	}

	// 2.1 Insertion sort String
	private static String[] GetRandomString(int length) {
		StringBuilder str;
		Random ra = new Random();
		String[] arr = new String[length];
		String ras = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÄäÅåÖö";

		for (int i = 0; i < arr.length; i++) {
			str = new StringBuilder();
			for (int j = 0; j < 9; j++) {
				str.append(ras.charAt(ra.nextInt(ras.length())));
				j++;
			}
			arr[i] = str.toString();
		}
		return arr;
	}

	public static void StringInsertion() {
		String[] arr = GetRandomString(1000);
		int time = 0;
		while (time <= 1000) {
			long start = System.currentTimeMillis();
			insertionSortString(arr);
			long end = System.currentTimeMillis();
			time = (int) (end - start);

			System.out.println(
					"During " + time + " milliseconds, the length of string sorted by insertion: " + arr.length);

			if (time == 999 || time == 1000 || time == 1001) {
				break;
			} else if (time > 1001 && time <= 1050) {
				arr = GetRandomString(arr.length - 1);
				time = 0;
			} else if (time > 1050) {
				arr = GetRandomString(arr.length - 100);
				time = 0;
			} else if (time <= 950) {
				arr = GetRandomString(arr.length + 100);
				time = 0;
			} else {
				arr = GetRandomString(arr.length + 1);
			}
		}
	}

	public static String[] insertionSortString(String[] in) {
		String[] out = new String[in.length];
		System.arraycopy(in, 0, out, 0, in.length);

		for (int i = 1; i < out.length; i++) {
			String key = out[i];
			int j = i - 1;
			while (j >= 0) {
				if (out[j].compareToIgnoreCase(key) <= 0)
					break;
				out[j + 1] = out[j];
				j--;
			}
			out[j + 1] = key;
		}
		return out;
	}

	// 2.2 Merge sort String
	public static void StringMerge() {
		String[] arr = GetRandomString(1000);
		int time = 0;
		while (time <= 1000) {
			long start = System.currentTimeMillis();
			mergeSortString(arr);
			long end = System.currentTimeMillis();
			time = (int) (end - start);

			System.out.println("During " + time + " milliseconds, the length of string sorted by merge: " + arr.length);

			if (time == 999 || time == 1000 || time == 1001) {
				break;
			} else if (time > 1001 && time <= 1050) {
				arr = GetRandomString(arr.length - 1);
				time = 0;
			} else if (time > 1050) {
				arr = GetRandomString(arr.length - 100);
				time = 0;
			} else if (time <= 950) {
				arr = GetRandomString(arr.length + 10000);
				time = 0;
			} else {
				arr = GetRandomString(arr.length + 1);
			}
		}
	}

	// Merge (VG)
	public static String[] mergeSortString(String[] in) {
		String[] arr = new String[in.length];
		System.arraycopy(in, 0, arr, 0, in.length);
		String[] left;
		String[] right;
		int count = 0;
		int first = 0;
		int second = 0;

		if (in.length == 1)
			return arr;
		else {
			left = new String[in.length / 2];
			right = new String[in.length - left.length];

			System.arraycopy(in, 0, left, 0, left.length);
			System.arraycopy(in, left.length, right, 0, right.length);
		}
		left = mergeSortString(left);
		right = mergeSortString(right);

		while (first < left.length && second < right.length) {
			if (left[first].compareToIgnoreCase(right[second]) <= 0) {
				arr[count] = left[first];
				first++;
			} else {
				arr[count] = right[second];
				second++;
			}
			count++;
		}

		while (first < left.length) {
			arr[count] = left[first];
			first++;
			count++;
		}

		while (second < right.length) {
			arr[count] = right[second];
			second++;
			count++;
		}
		return arr;
	}
}
