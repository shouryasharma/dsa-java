package arrays;
import java.util.Arrays;

public class MaxMinInArray {
    static int[] findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        return new int[] { max, min };
    }

    public static void main(String[] args) {
        int[] myList1 = { 5, 3, 8, 1, 6, 9 };
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"
    }
}