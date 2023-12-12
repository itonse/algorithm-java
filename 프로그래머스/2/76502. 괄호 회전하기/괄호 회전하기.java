import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        
        if (s.length() % 2 != 0) return 0;
        
        for (char ch : s.toCharArray()) {
            queue.add(ch);
        }

        for (int cnt = 0; cnt < s.length(); cnt++) {
            Stack<Character> stack = new Stack<>();
            Queue<Character> copyQueue = new LinkedList<>(queue);

            while (!copyQueue.isEmpty()) {
                char ch = copyQueue.poll();

                if (stack.isEmpty() && (ch == ')' || ch == ']' || ch == '}')) {
                    break;
                } else if (ch == ')') {
                    if (stack.peek() != '(') break;
                    stack.pop();
                } else if (ch == ']') {
                    if (stack.peek() != '[') break;
                    stack.pop();
                } else if (ch == '}') {
                    if (stack.peek() != '{') break;
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            if (copyQueue.isEmpty() && stack.isEmpty()) {
                answer++;
            }

            queue.add(queue.poll());
        }

        return answer;
    }
}