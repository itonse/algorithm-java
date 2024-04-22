import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 1; i <= order.length; i++){
            queue.offer(i);
        }

        int cur = 0;
        for(int i : order){
            while(true){
                if(i < cur){
                    if(stack.peek() == i){
                        cur = stack.pop();
                        answer++;
                        break;
                    } else{
                        return answer;
                    }
                } else if(!queue.isEmpty()){
                    if(queue.peek() == i){
                        cur = queue.poll();
                        answer++;
                        break;
                    } else{
                        stack.push(queue.poll());
                    }
                }
            }
        }

        return answer;
    }
}