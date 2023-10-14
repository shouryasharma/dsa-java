package sort;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int i = 0, temp = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] { 3, 0, 1 }));
        System.out.println(missingNumber(new int[] { 0, 1 }));
        System.out.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}
