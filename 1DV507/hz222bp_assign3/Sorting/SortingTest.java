package hz222bp_assign3.Sorting;

/*Assignment 3; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2018-02-21*/
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortingTest {
	SortingAlgorithms sa = new SortingAlgorithms();

	@Test
	public void InsertionSortInteger() {
		int[] arr = { 32, 1, -7, 15, 13, 0 };
		sa.insertionSort(arr);
		assertEquals("[-7, 0, 1, 13, 15, 32]", Arrays.toString(arr));
	}

	@Test
	public void InsertionSortString() {
		String[] str = { "roll", "yeez", "Aa", "Although" };
		Comparator<String> length = (str1, str2) -> str1.length() - str2.length();
		Comparator<String> alph = (str1, str2) -> str1.compareTo(str2);

		sa.insertionSort(str, length);
		assertEquals("[Aa, yeez, roll, Although]", Arrays.toString(str));
		sa.insertionSort(str, alph);
		assertEquals("[Aa, Although, roll, yeez]", Arrays.toString(str));
	}

	@Test
	public void MergeSortInteger() {
		int[] arr = { 91, -3, -2, 17, 13, 0 };
		sa.mergeSort(arr);
		assertEquals("[-3, -2, 0, 13, 17, 91]", Arrays.toString(arr));

	}

	@Test
	public void MergeSortString() {
		String[] str = { "car", "Ärnak", "dewsop", "morning" };
		Comparator<String> length = (str1, str2) -> str1.length() - str2.length();
		Comparator<String> alph = (str1, str2) -> str1.compareTo(str2);

		sa.mergeSort(str, length);
		assertEquals("[car, Ärnak, dewsop, morning]", Arrays.toString(str));
		sa.mergeSort(str, alph);
		assertEquals("[car, dewsop, morning, Ärnak]", Arrays.toString(str));

	}

}
