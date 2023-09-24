package algorithms;

public class NewBinarySearch {
    static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (target > nums[mid]) {
                end = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
        // int start = 0, end = arr.length - 1, mid;
        // boolean asc = arr[start] < arr[end];

        // while (start <= end) {
        // mid = start + (end - start) / 2;
        // if (arr[mid] == element) {
        // return mid;
        // }
        // if (asc && element > arr[mid]) {
        // start = mid + 1;
        // } else if (!asc && element < arr[mid]) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }

        // return -1;
    }

    public static void main(String[] args) {
        // sorted array
        int[] ascArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] descArr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        int element = 9;
        System.out.println(binarySearch(ascArr, element));
    }
}