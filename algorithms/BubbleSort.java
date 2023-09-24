package algorithms;

import java.util.Arrays;

public class BubbleSort {

	// Bubble Sort
	public static void bubbleSort(int[] array) {
		int temp;
		boolean swap = false;
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swap = true;
				}
			}
			if (!swap)
				break;
		}
	}

	public static void main(String[] args) {
		// int[] array = { 8, 6, 5, 3, 6, 8, 9 };
		int[] array = { 4, 2, 6, 5, 1, 3 };
		// int[] array = { 1, 2, 3, 4 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}