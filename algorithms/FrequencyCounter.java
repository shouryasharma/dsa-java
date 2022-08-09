package algorithms;

import java.util.HashMap;

class FrequencyCounter {
    public static void main(String[] args) {
        String[] arr1 = { "c", "e", "l", "l" };
        String[] arr2 = { "l", "e", "c", "l" };

        boolean result = frequencyCounter(arr1, arr2);
        System.out.println(result);
    }

    static boolean frequencyCounter(String[] arr1, String[] arr2) {
        // make a hashmap
        HashMap<String, Integer> word1 = new HashMap<>();
        HashMap<String, Integer> word2 = new HashMap<>();
        boolean[] result = { true };

        // count the number of occurences of each element in arr1
        for (int i = 0; i < arr1.length; i++) {
            if (word1.get(arr1[i]) != null) {
                word1.put(arr1[i], word1.get(arr1[i]) + 1);
            } else {
                word1.put(arr1[i], 1);
            }
        }

        // count the number of occurences of each element in arr2
        for (int i = 0; i < arr2.length; i++) {
            if (word2.get(arr2[i]) != null) {
                word2.put(arr2[i], word2.get(arr2[i]) + 1);
            } else {
                word2.put(arr2[i], 1);
            }
        }

        // System.out.println("word1: " + word1);
        // System.out.println("word2: " + word2);

        word1.forEach((key, value) -> {
            // check if the values correspond & if the keys correspond
            if (!word2.containsKey(key) || word1.get(key) != word2.get(key))
                result[0] = false;
        });

        return result[0];
    }
}