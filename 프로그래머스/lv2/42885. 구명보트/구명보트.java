import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length - 1;

        Arrays.sort(people);

        while (left <= right) {
            if (left == right) {
                answer++;
                break;
            }

            if (people[right] <= limit / 2) {
                answer += (right - left + 2) / 2;
                break;
            }

            if (people[left] + people[right] <= limit) {
                answer++;

                left++;
                right--;
            } else {
                answer++;

                right--;
            }
        }
        
        return answer;
    }
}