package algorithms;

import java.util.Arrays;

public class CycleSort {
    static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] != i + 1) {
                int temp = 0;
                temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[2] = 3;
        System.out.println(Arrays.toString(cycleSort(arr)));
        System.out.println(Arrays.toString(cycleSort(new int[] { 2, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(cycleSort(new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(cycleSort(new int[] { 4, 1, 2, 3 })));
    }
}
