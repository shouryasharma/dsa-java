package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

    static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Integer num : map.keySet()) {
            if (map.get(num) > 1)
                duplicates.add(num);
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 1, 4, 5, 4 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }
}
