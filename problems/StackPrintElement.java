package problems;

import java.util.Scanner;
import java.util.Stack;

// Print the element
// Description
// You are given a stack with n integers and you need to print the fifth element from the top of the stack.

// Input Format
// The first line contains an integer n denoting the size of stack.
// The next line contains n space-separated integers denoting the elements of stack.
// Output Format
// Print an integer. This should be the fifth element from the top of the stack.
// Note: If the number of elements in the stack is less than 5, then print “There are not enough elements in the stack”.
// Sample Input 1:
// 12
// 1 2 3 4 5 6 7 8 9 10 11 12
// Sample Output 1:
// 8
// Sample Input 2:
// 4
// 1 2 3 4
// Sample Output 2:
// There are not enough elements in the stack

public class StackPrintElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Why n-- here?
        while (n > 0) {
            stack.push(scan.nextInt());
            n--;
        }
        scan.close();
        System.out.println("original stack: " + stack);
        printFifthElementFromStart(stack);
    }

    private static void printFifthElementFromStart(Stack<Integer> stack) {
        System.out.println("original size of the stack: " + stack.size());
        if (stack.size() < 5) {
            System.out.println("There are not enough elements in the stack");
        } else {
            int i = 0;
            while (i < 4) {
                stack.pop();
                i++;
            }
            if (!stack.empty()) {
                System.out.println(stack.peek());
            } else {
                System.out.println("There are not enough elements in the stack");
            }
        }
    }
}
