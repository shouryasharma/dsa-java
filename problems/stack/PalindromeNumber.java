package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Leetcode #9 Palindrome Number
 */
public class PalindromeNumber {
    static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;

        while (temp > 0) {
            // get the last digit of the integer
            int digit = temp % 10;
            // multiply the existing reverse integer by 10 and add the digit in it
            reverse = reverse * 10 + digit;
            // remove the last digit of the temp integer (copy of x)
            temp = temp / 10;
        }

        return x == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        // int x = 123;
        System.out.println(isPalindrome(x));
    }
}