class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] srr = s.toLowerCase().split("");
        
        boolean isFirst = true;
        
        for(int i = 0; i < srr.length; i++) {  
            answer += isFirst ? srr[i].toUpperCase() : srr[i];

            isFirst = srr[i].equals(" ") ? true : false;            
        }
        
        return answer;
    }
}