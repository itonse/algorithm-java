import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int twoSum = 0;
        
        Arrays.sort(sides);
        
        twoSum = sides[0] + sides[1];
        
        if(twoSum > sides[2]) {
            answer = 1;
        } else{
            answer = 2;
        }
        
        return answer;
    }
}