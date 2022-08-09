package datastructures;

import java.util.*;

class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        s.close();
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int arrayElement = 0, numberOfZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[arrayElement] = arr[i];
                arrayElement++;
            } else {
                numberOfZeroes++;
            }
        }

        for (int i = arr.length - numberOfZeroes; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}