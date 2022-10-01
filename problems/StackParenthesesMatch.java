package problems;

import java.util.*;

public class StackParenthesesMatch {
	private static Stack<Character> stack = new Stack<>();
	public static void main(String[] args) {
		try {
			System.out.println(match("(())"));
			System.out.println(match("(()"));
			System.out.println(match("@@"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static boolean match(String paren) throws Exception {
		for (int i=0; i<paren.length(); i++) {
			char c = paren.charAt(i);
			if(c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.empty()) {
					return false;
				} else {
					stack.pop();
				}
			} else {
				throw new Exception("Invalid Character");
			}
		}
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}				
	}
}
