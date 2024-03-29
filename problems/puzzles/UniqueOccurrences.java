package puzzles;

import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.HashSet;

// leetcode 1207. Unique Number of Occurrences
public class UniqueOccurrences {
    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (Entry<Integer, Integer> element : map.entrySet()) {
            if (!set.contains(element.getValue())) {
                set.add(element.getValue());
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2 }));
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
    }
}
