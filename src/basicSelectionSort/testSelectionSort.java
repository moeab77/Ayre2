package basicSelectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void testPositive() {
	SelectionSort sorter = new SelectionSort();
	int[] arr = {4, 2, 8, 1, 5};
	int[] expected = {1, 2, 4, 5, 8};
	sorter.selectionSort(arr);
	assertArrayEquals(expected, arr);

	
	

	}
	@Test
	public void testNegatives() {
	SelectionSort sorter = new SelectionSort();
	int[] arr = {-4, -2, -8, -1, -5};
	int[] expected = {-8, -5, -4, -2, -1};
	sorter.selectionSort(arr);
	assertArrayEquals(expected, arr);
	}
	@Test
	public void testMixed() {
	SelectionSort sorter = new SelectionSort();
	int[] arr = {4, -2, 0, -1, 5};
	int[] expected = {-2, -1, 0, 4, 5};
	sorter.selectionSort(arr);
	assertArrayEquals(expected, arr);
	}


}
