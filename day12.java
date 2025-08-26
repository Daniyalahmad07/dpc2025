/*Valid Parentheses with Multiple Types

You are given a string s consisting of different types of parentheses: (), {}, and []. Your task is to determine whether the given string is valid.
A string is considered valid if:
Every opening bracket has a corresponding closing bracket of the same type.
The brackets are closed in the correct order. This means that a closing bracket must close the most recent unmatched opening bracket.
Constraints:
0 ≤ s.length ≤ 10^4
The string s contains only the characters ()[]{}.

*/
import java.util.Stack;

public class day12 {
    public static Boolean checkValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkValidParentheses("()"));
        System.out.println(checkValidParentheses("([)]"));
        System.out.println(checkValidParentheses("[{()}]"));
        System.out.println(checkValidParentheses(""));
        System.out.println(checkValidParentheses("{[}"));
        System.out.println(checkValidParentheses("((((("));
        System.out.println(checkValidParentheses(")))"));
        System.out.println(checkValidParentheses("([]{})"));
    }
}
