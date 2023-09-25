package stack;

import java.util.Stack;

/*
 * leetcode 20. Valid Parentheses
 */
public class ValidParantheses {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if (current == '(' || current == ')' || current == '{' || current == '}' || current == '['
                    || current == ']') {
                if (!stack.empty()) {
                    char previous = stack.peek();
                    if (previous == '(' && current == ')')
                        stack.pop();
                    else if (previous == '{' && current == '}')
                        stack.pop();
                    else if (previous == '[' && current == ']')
                        stack.pop();
                    else
                        stack.push(current);
                } else
                    stack.push(current);
            } else
                return false;

        }
        return stack.empty() == true;

    }

    public static void main(String[] args) {
        System.out.println(isValid("({[)")); // false
        System.out.println(isValid("()}{()")); // false
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid(")(")); // false
        System.out.println(isValid("[)")); // false
    }
}
