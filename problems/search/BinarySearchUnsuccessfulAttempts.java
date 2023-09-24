package search;

import java.util.*;

class BinarySearchUnsuccessfulAttempts {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int mid,
                start = 0,
                end = inputArr.length - 1,
                unsuccessfulAttempts = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (key == inputArr[mid])
                return unsuccessfulAttempts;
            if (key < inputArr[mid]) {
                end = mid - 1;
                unsuccessfulAttempts++;
            }
            if (key > inputArr[mid]) {
                start = mid + 1;
                unsuccessfulAttempts++;
            }
        }

        return unsuccessfulAttempts;
    }

    public static void main(String args[]) throws Exception {
        BinarySearchUnsuccessfulAttempts bs = new BinarySearchUnsuccessfulAttempts();
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            int key = scanner.nextInt();
            System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
        }
    }
}
