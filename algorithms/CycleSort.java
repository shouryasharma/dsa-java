package algorithms;

import java.util.Arrays;

public class CycleSort {
    static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) { // arr[i] is 2 and arr[correct] is 1
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        return arr;
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cycleSort(new int[] { 2, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(cycleSort(new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(cycleSort(new int[] { 4, 1, 2, 3 })));
    }
}
