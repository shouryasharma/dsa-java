package hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ValidAnagram {
    static boolean isAnagram(String s, String t) {
        Map<Character, Integer> characters = new HashMap<>();
        for (Character key : s.toCharArray()) {
            if (characters.containsKey(key)) {
                characters.put(key, characters.get(key) + 1);
            } else {
                characters.put(key, 1);
            }
        }

        for (Character key : t.toCharArray()) {
            if (characters.containsKey(key)) {
                characters.put(key, characters.get(key) - 1);
            } else {
                return false;
            }
        }

        for (Entry<Character, Integer> map : characters.entrySet()) {
            if (map.getValue() != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aa", "bb"));
        System.out.println(isAnagram("aacc", "ccac"));
        System.out.println(isAnagram("a", "ab"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
