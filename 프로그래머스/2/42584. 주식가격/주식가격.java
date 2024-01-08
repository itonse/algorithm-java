import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{prices[0], 0});

        for (int idx = 1; idx < prices.length; idx++) {
            int[] arr = stack.peek();

            if (arr[0] > prices[idx]) { 
                while (!stack.isEmpty() && stack.peek()[0] > prices[idx]) {
                    int time = stack.pop()[1];
                    answer[time] = idx - time;
                }
            }

            stack.push(new int[]{prices[idx], idx});
        }

        while (!stack.isEmpty()) {
            int[] popArr = stack.pop();
            answer[popArr[1]] = prices.length - popArr[1] - 1;
        }

        return answer;
    }
}