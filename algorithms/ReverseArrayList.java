package algorithms;

import java.util.ArrayList;
import java.util.*;

class ReverseArrayList {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        s.close();
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        int listSize = list.size();
        for (int i = 0; i < listSize / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(listSize - 1 - i));
            list.set(listSize - 1 - i, temp);
        }
    }
}
