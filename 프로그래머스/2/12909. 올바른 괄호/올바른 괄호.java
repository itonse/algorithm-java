import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            }
        }
        
        return stack.isEmpty() ? true : false;
    }
}