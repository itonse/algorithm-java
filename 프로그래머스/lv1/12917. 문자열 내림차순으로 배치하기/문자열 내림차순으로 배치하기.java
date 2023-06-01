import java.util.*;

class Solution {
    public String solution(String s) {
        String answer[] = s.split("");
        String str="";
        
        Arrays.sort(answer,Collections.reverseOrder());
        
        for(int i=0;i<answer.length;i++){
            str+=answer[i];
        }

        return str;
    }
}