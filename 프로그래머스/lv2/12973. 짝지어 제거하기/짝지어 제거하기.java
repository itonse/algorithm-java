import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character>stack = new Stack<>();
        
        int idx = 0;
        while (idx < s.length()) {
            if (stack.size() == 0) {
                stack.push(s.charAt(idx));
            } else if ((char) stack.peek() == s.charAt(idx)) {
                stack.pop();
            } else {
                stack.push(s.charAt(idx));
            }
            idx++;
        }

        return stack.isEmpty() ? 1 : 0;
    }
}