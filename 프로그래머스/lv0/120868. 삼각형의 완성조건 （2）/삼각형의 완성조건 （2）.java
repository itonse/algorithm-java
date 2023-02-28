import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int num = 0;

        Arrays.sort(sides);

        num = sides[0];
        while(num + sides[0] > sides[1]) {
            num--;
            answer++;
        }

        num = sides[1];
        while(sides[0] + num > sides[1] && num > sides[0]) {
            num--;
            answer++;
        }

        num = sides[1] + 1;
        while(sides[0] + sides[1] > num) {
            num++;
            answer++;
        }
        
        return answer;
    }
}