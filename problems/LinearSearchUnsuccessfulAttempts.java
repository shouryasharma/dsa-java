package problems;

import java.util.*;

public class LinearSearchUnsuccessfulAttempts {
    public static void main(String[] args) {
        LinearSearchUnsuccessfulAttempts ls = new LinearSearchUnsuccessfulAttempts();
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            int key = scanner.nextInt();
            System.out.println(ls.getLinearSearchUnsuccessfulComparisonCount(array, key));
        }
    }

    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int unsuccessfulAttempts = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == key) {
                return i;
            } else {
                unsuccessfulAttempts++;
            }
        }
        return unsuccessfulAttempts;
    }
}
