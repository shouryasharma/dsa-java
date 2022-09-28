package algorithms;

import java.util.Arrays;

public class BubbleSort {

	// Bubble Sort
	public int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int swap = 0;
			for (int j = 1; j < (array.length - i); j++) {
				int tempForSwap = 0;
				if (array[j - 1] > array[j]) {
					tempForSwap = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tempForSwap;
					swap = 1;
				}
			}
			if (swap == 0)
				break;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 8, 6, 5, 3, 6, 8, 9 };
		BubbleSort bs = new BubbleSort();
		System.out.println(Arrays.toString(bs.bubbleSort(array)));
	}
}