package algorithms;

public class BubbleSort {

	// Bubble Sort
	protected int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int tempForSwap = 0;
				if (array[i] < array[j]) {
					tempForSwap = array[i];
					array[i] = array[j];
					array[j] = tempForSwap;
				}
			}
		}

		return array;
	}

	public static void name(String[] args) {
		System.out.println("Hello");
	}
}