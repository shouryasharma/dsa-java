package hashmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if (numsMap.containsKey(targetNum)) {
                return new int[] { numsMap.get(targetNum), i };
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
