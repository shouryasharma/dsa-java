package stack;

import java.util.Stack;

public class MultiParanthesesMatch {
	public static void main(String[] args) {
		try {
			System.out.println(match("(){({}())}"));
			System.out.println(match("{(())}"));
			System.out.println(match("{(()}"));
			System.out.println(match("@@"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static boolean match(String parens) throws Exception {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < parens.length(); i++) {
			char currentChar = parens.charAt(i);
			if (currentChar == '{' || currentChar == '(') {
				stack.push(currentChar);
			} else if (currentChar == '}' || currentChar == ')') {
				if (!stack.empty()) {
					char topChar = stack.peek();
					if ((topChar == '(' && currentChar == ')') || (topChar == '{' && currentChar == '}')) {
						stack.pop();
					}
				} else {
					return false;
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
