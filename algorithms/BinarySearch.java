package algorithms;

public class BinarySearch {
	static int[] sortedArrayOfIntegers = { 1, 2, 3, 4, 6, 7, 8, 9 };
	// static int[] sortedArrayOfIntegers = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	static int element = 5;

	// Binary Search
	static int binarySearch(int[] sortedArrayOfIntegers, int element) {
		int start = 0, end = sortedArrayOfIntegers.length - 1, mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;

			if (sortedArrayOfIntegers[mid] == element)
				return mid;

			// Check Ascending or Descending
			if (sortedArrayOfIntegers[start] < sortedArrayOfIntegers[end]) {
				if (element < sortedArrayOfIntegers[mid])
					end = mid - 1;
				else
					start = mid + 1;

			} else {
				if (element > sortedArrayOfIntegers[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}

		return start;
	}

	public static void main(String[] args) {
		int result = binarySearch(sortedArrayOfIntegers, element);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println(result);
		}
	}
}