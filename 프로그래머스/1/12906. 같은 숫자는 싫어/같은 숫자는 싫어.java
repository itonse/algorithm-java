import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        Stack stack = new Stack();

        for (int i : arr) {
            if (stack.isEmpty() || (int)stack.peek() != i) {
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];

        for (int j = stack.size() - 1; j >= 0; j--) {
            answer[j] = (int)stack.pop();
        }
        
        return answer;
    }
}