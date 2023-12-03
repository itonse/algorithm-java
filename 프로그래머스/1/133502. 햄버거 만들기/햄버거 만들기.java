import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int num : ingredient) {
            stack.push(num);
            if (stack.size() >= 4 && isPattern(stack)) {
                for (int i = 0; i < 4; i++) {
                    stack.pop();
                }
                answer++;
            }
        }

        return answer;
    }
    
    private boolean isPattern(Stack<Integer> stack) {
        int[] pattern = {1, 2, 3, 1};
        
        for (int i = 4; i > 0; i--) {
            if (!(stack.get(stack.size() - i) == pattern[4 - i])) {
                return false;
            }
        }
        
        return true;
    }
}