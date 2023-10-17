package sort;

import java.util.Arrays;

// TODO https://leetcode.com/problems/first-missing-positive
public class FirstMissingPositiveNumber {
    public static int firstMissingPositive(int[] nums) {
        int i = 0, correct;
        while (i < nums.length) {
            correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] { 1, 2, 0 }));
        System.out.println(firstMissingPositive(new int[] { 3, 4, -1, 1 }));
        System.out.println(firstMissingPositive(new int[] { 7, 8, 9, 11, 12 }));
    }
}
