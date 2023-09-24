package hashset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReturnUniqueValues {
    static int[] returnUniqueValues(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int i = 0;
        for (int num : hashSet) {
            if (i >= hashSet.size())
                nums[i] = num;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 2 };
        System.out.println(Arrays.toString(returnUniqueValues(nums)));
    }
}