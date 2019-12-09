package hz222bp_assign3.Sorting;

import java.util.*;

/*Assignment 3; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2018-02-20*/
public class SortingAlgorithms {
	// The question does not ask to write a main method but I did it here for
	// stating the comparator.
	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		Comparator<String> length = (str1, str2) -> str1.length() - str2.length();
		Comparator<String> alph = (str1, str2) -> str1.compareTo(str2);

		System.out.print("Integer Array: ");
		int[] num = { 2, 3, 6, 3, 9, 1, 0 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		sa.insertionSort(num);
		System.out.println();
		System.out.print("Insertion: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		sa.mergeSort(num);
		System.out.println();
		System.out.print("Merge: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		String[] str = { "Actor", "zoo", "hi", "ana" };
		System.out.println();
		System.out.print("String Array: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

		sa.insertionSort(str, length);
		System.out.println();
		System.out.print("Insertion sort by length: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		sa.insertionSort(str, alph);
		System.out.println();
		System.out.print("Insertion sort by alphabet: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

		sa.mergeSort(str, length);
		System.out.println();
		System.out.print("Merge sort by length: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		sa.mergeSort(str, alph);
		System.out.println();
		System.out.print("Merge sort by alphabet: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}

	// Integer
	// Insertion sort
	public int[] insertionSort(int[] in) {
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

	// Merge Sort(VG)
	public int[] mergeSort(int[] in) {
		int[] temp = in;
		if (temp.length < 2) {
			return temp;
		} else {
			int mid = temp.length / 2;
			int[] left = Arrays.copyOfRange(temp, 0, mid);
			int[] right = Arrays.copyOfRange(temp, mid, temp.length);

			left = mergeSort(left);
			right = mergeSort(right);

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

	// String
	//Insertion
	public String[] insertionSort(String[] in, Comparator<String> c) {
		String[] input = in;

		for (int i = 1; i < input.length; i++) {
			String temp = input[i];
			int j = i;
			while ((j > 0) && c.compare(temp, input[j - 1]) <= 0) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = temp;
		}
		return input;
	}

	// Merge (VG)
	public String[] mergeSort(String[] in, Comparator<String> c) {
		if (in.length < 2) {
			return in;
		} else {
			String[] temp = in;
			int mid = in.length / 2;
			String[] left = Arrays.copyOfRange(in, 0, mid);
			String[] right = Arrays.copyOfRange(in, mid, in.length);

			mergeSort(left, c);
			mergeSort(right, c);

			// Merge
			int leftStr = 0;
			int rightStr = 0;
			int j = 0;

			while (leftStr < left.length && rightStr < right.length) {
				if (c.compare(left[leftStr], right[rightStr]) <= 0) {
					temp[j] = left[leftStr];
					leftStr++;
				} else {
					temp[j] = right[rightStr];
					rightStr++;
				}
				j++;

			}

			if (leftStr < left.length) {
				for (int i = leftStr; i < left.length; i++) {
					temp[j] = left[i];
					j++;
				}
			}

			else {
				for (int i = rightStr; i < right.length; i++) {
					temp[j] = right[i];
					j++;
				}
			}
			return temp;
		}
	}
}
