import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int lightest = 0;
        int heaviest = people.length - 1;
        
        Arrays.sort(people);
        
        while (lightest <= heaviest) {
            if (people[lightest] + people[heaviest] <= limit) {
                lightest++;
            }
            heaviest--;
            answer++;
        }
        
        return answer;
    }
}