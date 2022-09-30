package problems;

public class MatchingParantheses {
    public static void main(String[] args) {
        try {
            System.out.println(match("()())"));
            System.out.println(match("()()"));
	    System.out.println(match("[]"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String parantheses) throws Exception {
        int count = 0;
        for (int i = 0; i < parantheses.length(); i++) {
            if (parantheses.charAt(i) == '(') {
                count++;
            } else if (parantheses.charAt(i) == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            } else {
                throw new Exception("Invalid Character");
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

}
