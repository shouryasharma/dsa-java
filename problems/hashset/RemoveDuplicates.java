package hashset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> hashSet = new HashSet<>();
        for (Integer num : list) {
            hashSet.add(num);
        }
        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer num : hashSet) {
            uniqueElements.add(num);
        }
        return uniqueElements;
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * [1, 2, 3, 4, 5, 6, 7, 8, 9]
         * 
         * (Order may be different as sets are unordered)
         */

    }
}