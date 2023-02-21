class Solution {
    public String solution(String my_string) {
        char[] ch = new char[my_string.length()];
        String answer = "";
        boolean dup = false;
        
        for(int i = 0; i < my_string.length(); i++) {
            ch[i] = my_string.charAt(i);
        }
        
        for(int j = 0; j < ch.length; j++) {
            for(int k = 0; k < j; k++) {
                if(ch[j] == ch[k]) {
                    dup = true;
                }
            }
            if(dup == false) {
                    answer += ch[j];
                }
            
            dup = false;
        }
        
        return answer;
    }
}