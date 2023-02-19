import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String str = "";

        str = my_string.replaceAll("[a-z]", "");

        answer = new int[str.length()];
        
        for(int j = 0; j < str.length(); j++) {
            answer[j] = str.charAt(j) - '0';
        }
        
        Arrays.sort(answer);
        return answer;
    }
}