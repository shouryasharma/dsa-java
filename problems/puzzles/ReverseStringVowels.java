package puzzles;

import java.util.Set;
import java.util.HashSet;

public class ReverseStringVowels {
    static String reverseVowels(String s) {
        // store all the vowels in a HashSet to lookup with O(1)
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // iterate over all the chars in the string from front and back with two pointers
        int start = 0;
        int end = s.length() - 1;
        while (start < s.length() && end > 0) {
            if ()
        }

        return "";
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        String s3 = "alphabet";
        // aeiou -> uoiea

        System.out.println(reverseVowels(s1)); // Output: "holle"
        System.out.println(reverseVowels(s2)); // Output: "leotcede"
        System.out.println(reverseVowels(s3)); // Output: "elphabat"

    }
}