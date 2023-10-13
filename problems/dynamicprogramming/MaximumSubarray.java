package dynamicprogramming;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = currSum;

        for (int i = 1; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < nums[i])
                currSum = nums[i];
            if (currSum > maxSum)
                maxSum = currSum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { 1, -1, 3, -2 })); // 3
        System.out.println(maxSubArray(new int[] { -1, -1, -3, -2 })); // -1
        System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
        System.out.println(maxSubArray(new int[] { 1 })); // 1
        System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 })); // 23
    }
}
