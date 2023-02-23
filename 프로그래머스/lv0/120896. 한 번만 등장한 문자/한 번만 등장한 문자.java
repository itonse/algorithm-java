import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = new char[s.length()];
        int dup = 0;

        for(int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        Arrays.sort(ch);

        for(int j = 0; j < ch.length; j++) {
            for(int k = 0; k < ch.length; k++) {
                if(ch[j] == ch[k]) {
                    dup++;
                }
            }
            if(dup == 1) {
                answer += ch[j];
            }
            dup = 0;
        }
        
        return answer;
    }
}