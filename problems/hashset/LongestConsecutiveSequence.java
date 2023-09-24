package hashset;

import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        int longestConsecutiveSequence = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int consecutiveSequence = 1;
                int currentNum = num;

                while (numSet.contains(currentNum + 1)) {
                    consecutiveSequence++;
                    currentNum++;
                }

                longestConsecutiveSequence = Math.max(consecutiveSequence, longestConsecutiveSequence);
            }
        }

        return longestConsecutiveSequence;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 6, 7, 8 };
        int[] nums1 = { 100, 4, 200, 1, 3, 2 };
        int[] nums2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        System.out.println(longestConsecutiveSequence(nums));
        System.out.println(longestConsecutiveSequence(nums1));
        System.out.println(longestConsecutiveSequence(nums2));

    }
}
