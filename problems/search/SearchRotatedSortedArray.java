package search;

public class SearchRotatedSortedArray {

    static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;

        // find the pivot
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        // pick side
        int secondStart = start;
        start = 0;
        end = nums.length - 1;

        if (target >= nums[secondStart] && target <= nums[end]) {
            start = secondStart;
        } else {
            end = secondStart - 1;
        }

        // binary search
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }

        return -1;
    }

    static int searchOld(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {1, 2, 3, 4, 5, 6, 7}, 2));
        System.out.println(search(new int[] { 3, 1 }, 1)); // 1
        System.out.println(search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 8)); // 4
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0)); // 4
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3)); // -1
        System.out.println(search(new int[] { 1 }, 0)); // -1
    }
}
