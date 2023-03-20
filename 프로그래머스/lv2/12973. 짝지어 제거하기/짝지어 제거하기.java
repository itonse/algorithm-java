import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack stack = new Stack<>();


        stack.push(s.charAt(0));
        int idx = 1;
        while (idx < s.length()) {
            if (!stack.isEmpty() && (char) stack.peek() == s.charAt(idx)) {
                stack.pop();
            } else {
                stack.push(s.charAt(idx));
            }

            idx++;
        }

        if (stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}