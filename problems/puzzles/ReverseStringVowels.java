package puzzles;

import java.util.Set;
import java.util.HashSet;

/*
 * leetcode 345. Reverse Vowels of a String
 */
public class ReverseStringVowels {
    static String reverseVowels(String s) {
        // store all the vowels in a HashSet to lookup with O(1)
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        // iterate over all the chars in the string,
        char[] result = s.toCharArray();
        int start = 0;
        int end = result.length - 1;

        while (start < result.length || end > 0) {
            boolean isStartVowel = vowels.contains(result[start]);
            boolean isEndVowel = vowels.contains(result[end]);

            if (start >= end)
                break;

            if (isStartVowel && isEndVowel) {
                char temp = result[start];
                result[start] = result[end];
                result[end] = temp;
                start++;
                end--;
            }

            if (!isStartVowel)
                start++;
            if (!isEndVowel)
                end--;

        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        String s3 = "alphabet";
        String s4 = "aA";
        // aeiou -> uoiea

        System.out.println(reverseVowels(s1)); // Output: "holle"
        System.out.println(reverseVowels(s2)); // Output: "leotcede"
        System.out.println(reverseVowels(s3)); // Output: "elphabat"
        System.out.println(reverseVowels(s4)); // Output: "Aa"
    }
}