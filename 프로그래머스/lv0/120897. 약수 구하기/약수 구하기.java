import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList list = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                list.add(i);
            }
        }

        int[] answer = list.stream().mapToInt(i -> (int) i).toArray();
        
        return answer;
    }
}