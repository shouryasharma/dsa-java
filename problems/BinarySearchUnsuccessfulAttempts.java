package problems;

import java.util.*;

class BinarySearchUnsuccessfulAttempts {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int start = 0, end = inputArr.length - 1, mid = 0, unsuccessfulAttempts = 0;
        boolean ascending = inputArr[start] < inputArr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (inputArr[mid] == key)
                return unsuccessfulAttempts;

            if (ascending) {
                unsuccessfulAttempts++;
                if (key > inputArr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                unsuccessfulAttempts++;
                if (key > inputArr[mid])
                    start = mid - 1;
                else
                    end = mid + 1;
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
