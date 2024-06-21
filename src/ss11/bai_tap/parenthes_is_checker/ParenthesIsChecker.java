package ss11.bai_tap.parenthes_is_checker;

import java.util.Stack;

public class ParenthesIsChecker {
    public static boolean checkString(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }



}
