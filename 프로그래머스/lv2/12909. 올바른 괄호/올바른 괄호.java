import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack stack = new Stack();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}