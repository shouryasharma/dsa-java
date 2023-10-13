package arrays;

public class InsertInterval {
    static int[][] insert(int[][] intervals, int[] newInterval) {
        

        // Nested loops to iterate through the 2D array and print its elements
        for (int i = 0; i < intervals.length; i++) {
            System.out.print(intervals[i][0] + " " + intervals[i][1]);
            System.out.println(); // Move to the next line after each row
        }

        return intervals;
    }

    public static void main(String[] args) {
        int arr1[][] = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        insert(arr1, new int[] { 4, 8 });

        int arr2[][] = { { 1, 3 }, { 6, 9 } };
        insert(arr2, new int[] { 2, 5 });
    }
}
