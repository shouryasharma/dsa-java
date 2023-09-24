package algorithms;

import java.util.*;

public class InsertionSort {

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    // Driver code
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            int array[] = { 1, 3, 2, 5, 4, 9, 8, 7 };
            InsertionSort.insertionSort(array);
            System.out.println(Arrays.toString(array));
        }
    }

}
