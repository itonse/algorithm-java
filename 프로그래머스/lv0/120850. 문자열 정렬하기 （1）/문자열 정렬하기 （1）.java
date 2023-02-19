import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String str = "";
        int n;

        for(int i= 0; i < my_string.length(); i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                str += my_string.charAt(i);
            }
        }

        answer = new int[str.length()];
        
        for(int j = 0; j < str.length(); j++) {
            answer[j] = str.charAt(j) - '0';
        }
        
        Arrays.sort(answer);
        return answer;
    }
}