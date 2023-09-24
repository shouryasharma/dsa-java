package algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int temp, minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 8, 6, 5, 3, 6, 8, 9 };
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}