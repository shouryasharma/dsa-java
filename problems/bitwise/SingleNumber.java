package bitwise;
/*
 * leetcode
 */

public class SingleNumber {
    static int singleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 2 };
        System.out.println(singleNumber(arr));
    }
}
