package hashset;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] duplicates = { 1, 2, 3, 1 };
        int[] noDuplicates = { 1, 2, 3, 4 };

        System.out.println(containsDuplicate(duplicates));
    }
}
