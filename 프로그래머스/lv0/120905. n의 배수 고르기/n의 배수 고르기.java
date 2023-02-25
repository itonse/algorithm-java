import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList arr = new ArrayList<Integer>();

        for(int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arr.add(numlist[i]);
            }
        }

        int[] answer = arr.stream().mapToInt(i -> (int) i).toArray();
        
        return answer;
    }
}