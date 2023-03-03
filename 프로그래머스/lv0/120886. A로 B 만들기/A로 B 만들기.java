import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        int cnt = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]) {
                cnt++;
            }
        }

        if(cnt == arr1.length) {
            answer = 1;
        }
        
        return answer;
    }
}