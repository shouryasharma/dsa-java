package problems;

import java.util.*;

public class BubbleSortSwaps {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int M = scanner.nextInt();
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(totalBubbleSortSwaps(array, M));
        }
    }

    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int totalSwaps = 0;
        for (int i = 0; i < M; i++) {
            Boolean swap = false;
            for (int j = 1; j < size - i; j++) {
                int swapTemp = 0;
                if (array[j - 1] < array[j]) {
                    swapTemp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = swapTemp;
                    swap = true;
                    totalSwaps++;
                }
            }
            if (!swap)
                break;
        }
        return totalSwaps;
    }
}